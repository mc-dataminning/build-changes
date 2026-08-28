import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class emo {
   public static final Codec<emo> f = lv.ag.q().dispatch("element_type", emo::a, emp::codec);
   private static final jo<epg> a = jo.a(new epg(List.of()));
   @Nullable
   private volatile emq.a b;

   protected static <E extends emo> RecordCodecBuilder<E, emq.a> e() {
      return emq.a.c.fieldOf("projection").forGetter(emo::f);
   }

   protected emo(emq.a $$0) {
      this.b = $$0;
   }

   public abstract kj a(epj var1, doa var2);

   public abstract List<epi.c> a(epj var1, jf var2, doa var3, azn var4);

   public abstract eky a(epj var1, jf var2, doa var3);

   public abstract boolean a(epj var1, dfg var2, dfe var3, dwp var4, jf var5, jf var6, doa var7, eky var8, azn var9, eos var10, boolean var11);

   public abstract emp<?> a();

   public void a(dek $$0, epi.c $$1, jf $$2, doa $$3, azn $$4, eky $$5) {
   }

   public emo a(emq.a $$0) {
      this.b = $$0;
      return this;
   }

   public emq.a f() {
      emq.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<emq.a, emh> h() {
      return $$0 -> emh.b;
   }

   public static Function<emq.a, eml> a(String $$0) {
      return $$1 -> new eml(Either.left(ale.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<emq.a, eml> a(String $$0, jo<epg> $$1) {
      return $$2 -> new eml(Either.left(ale.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<emq.a, emn> b(String $$0) {
      return $$1 -> new emn(Either.left(ale.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<emq.a, emn> b(String $$0, jo<epg> $$1) {
      return $$2 -> new emn(Either.left(ale.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<emq.a, emn> a(String $$0, eos $$1) {
      return $$2 -> new emn(Either.left(ale.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<emq.a, emn> a(String $$0, jo<epg> $$1, eos $$2) {
      return $$3 -> new emn(Either.left(ale.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<emq.a, emi> a(jo<ekk> $$0) {
      return $$1 -> new emi($$0, $$1);
   }

   public static Function<emq.a, emm> b(List<Function<emq.a, ? extends emo>> $$0) {
      return $$1 -> new emm($$0.stream().map($$1x -> (emo)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
