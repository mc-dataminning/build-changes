import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class epk {
   public static final Codec<epk> f = ma.ag.q().dispatch("element_type", epk::a, epl::codec);
   private static final jq<esc> a = jq.a(new esc(List.of()));
   @Nullable
   private volatile epm.a b;

   protected static <E extends epk> RecordCodecBuilder<E, epm.a> e() {
      return epm.a.c.fieldOf("projection").forGetter(epk::f);
   }

   protected epk(epm.a $$0) {
      this.b = $$0;
   }

   public abstract kl a(esf var1, dqu var2);

   public abstract List<ese.a> a(esf var1, jh var2, dqu var3, bam var4);

   public abstract enu a(esf var1, jh var2, dqu var3);

   public abstract boolean a(esf var1, dhy var2, dhw var3, dzj var4, jh var5, jh var6, dqu var7, enu var8, bam var9, ero var10, boolean var11);

   public abstract epl<?> a();

   public void a(dhb $$0, ese.d $$1, jh $$2, dqu $$3, bam $$4, enu $$5) {
   }

   public epk a(epm.a $$0) {
      this.b = $$0;
      return this;
   }

   public epm.a f() {
      epm.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<epm.a, epd> h() {
      return $$0 -> epd.b;
   }

   public static Function<epm.a, eph> a(String $$0) {
      return $$1 -> new eph(Either.left(alz.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<epm.a, eph> a(String $$0, jq<esc> $$1) {
      return $$2 -> new eph(Either.left(alz.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<epm.a, epj> b(String $$0) {
      return $$1 -> new epj(Either.left(alz.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<epm.a, epj> b(String $$0, jq<esc> $$1) {
      return $$2 -> new epj(Either.left(alz.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<epm.a, epj> a(String $$0, ero $$1) {
      return $$2 -> new epj(Either.left(alz.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<epm.a, epj> a(String $$0, jq<esc> $$1, ero $$2) {
      return $$3 -> new epj(Either.left(alz.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<epm.a, epe> a(jq<eng> $$0) {
      return $$1 -> new epe($$0, $$1);
   }

   public static Function<epm.a, epi> b(List<Function<epm.a, ? extends epk>> $$0) {
      return $$1 -> new epi($$0.stream().map($$1x -> (epk)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
