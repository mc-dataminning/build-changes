import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class eku {
   public static final Codec<eku> e = lt.ag.r().dispatch("element_type", eku::a, ekv::codec);
   private static final jm<enl> a = jm.a(new enl(List.of()));
   @Nullable
   private volatile ekw.a b;

   protected static <E extends eku> RecordCodecBuilder<E, ekw.a> d() {
      return ekw.a.c.fieldOf("projection").forGetter(eku::e);
   }

   protected eku(ekw.a $$0) {
      this.b = $$0;
   }

   public abstract kh a(eno var1, dmk var2);

   public abstract List<enn.c> a(eno var1, jd var2, dmk var3, ayv var4);

   public abstract eje a(eno var1, jd var2, dmk var3);

   public abstract boolean a(eno var1, ddq var2, ddo var3, dux var4, jd var5, jd var6, dmk var7, eje var8, ayv var9, boolean var10);

   public abstract ekv<?> a();

   public void a(dcv $$0, enn.c $$1, jd $$2, dmk $$3, ayv $$4, eje $$5) {
   }

   public eku a(ekw.a $$0) {
      this.b = $$0;
      return this;
   }

   public ekw.a e() {
      ekw.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int f() {
      return 1;
   }

   public static Function<ekw.a, ekn> g() {
      return $$0 -> ekn.b;
   }

   public static Function<ekw.a, ekr> a(String $$0) {
      return $$1 -> new ekr(Either.left(akq.a($$0)), a, $$1);
   }

   public static Function<ekw.a, ekr> a(String $$0, jm<enl> $$1) {
      return $$2 -> new ekr(Either.left(akq.a($$0)), $$1, $$2);
   }

   public static Function<ekw.a, ekt> b(String $$0) {
      return $$1 -> new ekt(Either.left(akq.a($$0)), a, $$1);
   }

   public static Function<ekw.a, ekt> b(String $$0, jm<enl> $$1) {
      return $$2 -> new ekt(Either.left(akq.a($$0)), $$1, $$2);
   }

   public static Function<ekw.a, eko> a(jm<eiq> $$0) {
      return $$1 -> new eko($$0, $$1);
   }

   public static Function<ekw.a, eks> b(List<Function<ekw.a, ? extends eku>> $$0) {
      return $$1 -> new eks($$0.stream().map($$1x -> (eku)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
