import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class dwk {
   public static final Codec<dwk> e = jd.ai.q().dispatch("element_type", dwk::a, dwl::codec);
   private static final hg<dyu> a = hg.a(new dyu(List.of()));
   @Nullable
   private volatile dwm.a b;

   protected static <E extends dwk> RecordCodecBuilder<E, dwm.a> d() {
      return dwm.a.c.fieldOf("projection").forGetter(dwk::e);
   }

   protected dwk(dwm.a $$0) {
      this.b = $$0;
   }

   public abstract ib a(dyx var1, czc var2);

   public abstract List<dyw.c> a(dyx var1, gw var2, czc var3, arx var4);

   public abstract duv a(dyx var1, gw var2, czc var3);

   public abstract boolean a(dyx var1, cqk var2, cqi var3, dhb var4, gw var5, gw var6, czc var7, duv var8, arx var9, boolean var10);

   public abstract dwl<?> a();

   public void a(cpr $$0, dyw.c $$1, gw $$2, czc $$3, arx $$4, duv $$5) {
   }

   public dwk a(dwm.a $$0) {
      this.b = $$0;
      return this;
   }

   public dwm.a e() {
      dwm.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<dwm.a, dwd> g() {
      return $$0 -> dwd.b;
   }

   public static Function<dwm.a, dwh> a(String $$0) {
      return $$1 -> new dwh(Either.left(new aeu($$0)), a, $$1);
   }

   public static Function<dwm.a, dwh> a(String $$0, hg<dyu> $$1) {
      return $$2 -> new dwh(Either.left(new aeu($$0)), $$1, $$2);
   }

   public static Function<dwm.a, dwj> b(String $$0) {
      return $$1 -> new dwj(Either.left(new aeu($$0)), a, $$1);
   }

   public static Function<dwm.a, dwj> b(String $$0, hg<dyu> $$1) {
      return $$2 -> new dwj(Either.left(new aeu($$0)), $$1, $$2);
   }

   public static Function<dwm.a, dwe> a(hg<duh> $$0) {
      return $$1 -> new dwe($$0, $$1);
   }

   public static Function<dwm.a, dwi> a(List<Function<dwm.a, ? extends dwk>> $$0) {
      return $$1 -> new dwi($$0.stream().map($$1x -> (dwk)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
