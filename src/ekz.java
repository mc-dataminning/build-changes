import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ekz {
   public static final Codec<ekz> f = lt.ag.r().dispatch("element_type", ekz::a, ela::codec);
   private static final jm<enr> a = jm.a(new enr(List.of()));
   @Nullable
   private volatile elb.a b;

   protected static <E extends ekz> RecordCodecBuilder<E, elb.a> e() {
      return elb.a.c.fieldOf("projection").forGetter(ekz::f);
   }

   protected ekz(elb.a $$0) {
      this.b = $$0;
   }

   public abstract kh a(enu var1, dmm var2);

   public abstract List<ent.c> a(enu var1, jd var2, dmm var3, ayw var4);

   public abstract ejj a(enu var1, jd var2, dmm var3);

   public abstract boolean a(enu var1, dds var2, ddq var3, duz var4, jd var5, jd var6, dmm var7, ejj var8, ayw var9, end var10, boolean var11);

   public abstract ela<?> a();

   public void a(dcx $$0, ent.c $$1, jd $$2, dmm $$3, ayw $$4, ejj $$5) {
   }

   public ekz a(elb.a $$0) {
      this.b = $$0;
      return this;
   }

   public elb.a f() {
      elb.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<elb.a, eks> h() {
      return $$0 -> eks.b;
   }

   public static Function<elb.a, ekw> a(String $$0) {
      return $$1 -> new ekw(Either.left(akr.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<elb.a, ekw> a(String $$0, jm<enr> $$1) {
      return $$2 -> new ekw(Either.left(akr.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<elb.a, eky> b(String $$0) {
      return $$1 -> new eky(Either.left(akr.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<elb.a, eky> b(String $$0, jm<enr> $$1) {
      return $$2 -> new eky(Either.left(akr.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<elb.a, eky> a(String $$0, end $$1) {
      return $$2 -> new eky(Either.left(akr.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<elb.a, eky> a(String $$0, jm<enr> $$1, end $$2) {
      return $$3 -> new eky(Either.left(akr.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<elb.a, ekt> a(jm<eiv> $$0) {
      return $$1 -> new ekt($$0, $$1);
   }

   public static Function<elb.a, ekx> b(List<Function<elb.a, ? extends ekz>> $$0) {
      return $$1 -> new ekx($$0.stream().map($$1x -> (ekz)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
