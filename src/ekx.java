import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public abstract class ekx {
   public static final Codec<ekx> f = lt.ag.r().dispatch("element_type", ekx::a, eky::codec);
   private static final jm<enp> a = jm.a(new enp(List.of()));
   @Nullable
   private volatile ekz.a b;

   protected static <E extends ekx> RecordCodecBuilder<E, ekz.a> e() {
      return ekz.a.c.fieldOf("projection").forGetter(ekx::f);
   }

   protected ekx(ekz.a $$0) {
      this.b = $$0;
   }

   public abstract kh a(ens var1, dmm var2);

   public abstract List<enr.c> a(ens var1, jd var2, dmm var3, ayw var4);

   public abstract ejh a(ens var1, jd var2, dmm var3);

   public abstract boolean a(ens var1, dds var2, ddq var3, duz var4, jd var5, jd var6, dmm var7, ejh var8, ayw var9, enb var10, boolean var11);

   public abstract eky<?> a();

   public void a(dcx $$0, enr.c $$1, jd $$2, dmm $$3, ayw $$4, ejh $$5) {
   }

   public ekx a(ekz.a $$0) {
      this.b = $$0;
      return this;
   }

   public ekz.a f() {
      ekz.a $$0 = this.b;
      if ($$0 == null) {
         throw new IllegalStateException();
      } else {
         return $$0;
      }
   }

   public int g() {
      return 1;
   }

   public static Function<ekz.a, ekq> h() {
      return $$0 -> ekq.b;
   }

   public static Function<ekz.a, eku> a(String $$0) {
      return $$1 -> new eku(Either.left(akr.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<ekz.a, eku> a(String $$0, jm<enp> $$1) {
      return $$2 -> new eku(Either.left(akr.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<ekz.a, ekw> b(String $$0) {
      return $$1 -> new ekw(Either.left(akr.a($$0)), a, $$1, Optional.empty());
   }

   public static Function<ekz.a, ekw> b(String $$0, jm<enp> $$1) {
      return $$2 -> new ekw(Either.left(akr.a($$0)), $$1, $$2, Optional.empty());
   }

   public static Function<ekz.a, ekw> a(String $$0, enb $$1) {
      return $$2 -> new ekw(Either.left(akr.a($$0)), a, $$2, Optional.of($$1));
   }

   public static Function<ekz.a, ekw> a(String $$0, jm<enp> $$1, enb $$2) {
      return $$3 -> new ekw(Either.left(akr.a($$0)), $$1, $$3, Optional.of($$2));
   }

   public static Function<ekz.a, ekr> a(jm<eit> $$0) {
      return $$1 -> new ekr($$0, $$1);
   }

   public static Function<ekz.a, ekv> b(List<Function<ekz.a, ? extends ekx>> $$0) {
      return $$1 -> new ekv($$0.stream().map($$1x -> (ekx)$$1x.apply($$1)).collect(Collectors.toList()), $$1);
   }
}
