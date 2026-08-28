import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bvv implements cve {
   public static final Codec<jf<bvv>> a = mg.d.r();
   public static final yy<wl, jf<bvv>> b = yw.b(mh.W);
   private static final int c = azo.d(38.25F);
   private final Map<jf<byv>, bvv.a> d = new Object2ObjectOpenHashMap();
   private final bvw e;
   private final int f;
   private final Function<bvx, lw> g;
   @Nullable
   private String h;
   private int i;
   private int j;
   private int k;
   private Optional<awo> l = Optional.empty();
   private cvh m = cvj.g;

   protected bvv(bvw $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lr.a(ly.u, axy.c($$2, $$1));
      };
   }

   protected bvv(bvw $$0, int $$1, lw $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public int c() {
      return this.j;
   }

   public int d() {
      return this.k;
   }

   public boolean a(ars $$0, bxu $$1, int $$2) {
      return true;
   }

   public void a(ars $$0, @Nullable bwt $$1, @Nullable bwt $$2, bxu $$3, int $$4, double $$5) {
      this.a($$0, $$3, $$4);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void a(bxu $$0, int $$1) {
   }

   public void b(bxu $$0, int $$1) {
      this.l.ifPresent($$1x -> $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), $$1x, $$0.dm(), 1.0F, 1.0F));
   }

   public void a(ars $$0, bxu $$1, int $$2, bwt.d $$3) {
   }

   public void a(ars $$0, bxu $$1, int $$2, bvi $$3, float $$4) {
   }

   public boolean a() {
      return false;
   }

   protected String e() {
      if (this.h == null) {
         this.h = ag.a("effect", mg.d.b(this));
      }

      return this.h;
   }

   public String f() {
      return this.e();
   }

   public xa g() {
      return xa.c(this.f());
   }

   public bvw h() {
      return this.e;
   }

   public int i() {
      return this.f;
   }

   public bvv a(jf<byv> $$0, ali $$1, double $$2, byy.a $$3) {
      this.d.put($$0, new bvv.a($$1, $$2, $$3));
      return this;
   }

   public bvv a(int $$0) {
      return this.a($$0, $$0, $$0);
   }

   public bvv a(int $$0, int $$1, int $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      return this;
   }

   public void a(int $$0, BiConsumer<jf<byv>, byy> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jf<byv>)$$2, $$3.a($$0)));
   }

   public void a(byx $$0) {
      for (Entry<jf<byv>, bvv.a> $$1 : this.d.entrySet()) {
         byw $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(byx $$0, int $$1) {
      for (Entry<jf<byv>, bvv.a> $$2 : this.d.entrySet()) {
         byw $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean j() {
      return this.e == bvw.a;
   }

   public lw a(bvx $$0) {
      return this.g.apply($$0);
   }

   public bvv a(awo $$0) {
      this.l = Optional.of($$0);
      return this;
   }

   public bvv a(cvf... $$0) {
      this.m = cvj.e.a($$0);
      return this;
   }

   @Override
   public cvh k() {
      return this.m;
   }

   static record a(ali a, double b, byy.a c) {
      public byy a(int $$0) {
         return new byy(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}
