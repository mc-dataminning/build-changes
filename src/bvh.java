import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bvh implements cuj {
   public static final Codec<je<bvh>> a = mf.d.r();
   public static final yw<wj, je<bvh>> b = yu.b(mg.W);
   private static final int c = azm.d(38.25F);
   private final Map<je<byf>, bvh.a> d = new Object2ObjectOpenHashMap();
   private final bvi e;
   private final int f;
   private final Function<bvj, lv> g;
   @Nullable
   private String h;
   private int i;
   private int j;
   private int k;
   private Optional<awm> l = Optional.empty();
   private cum m = cuo.g;

   protected bvh(bvi $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lq.a(lx.u, axw.c($$2, $$1));
      };
   }

   protected bvh(bvi $$0, int $$1, lv $$2) {
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

   public boolean a(arq $$0, bxe $$1, int $$2) {
      return true;
   }

   public void a(arq $$0, @Nullable bwf $$1, @Nullable bwf $$2, bxe $$3, int $$4, double $$5) {
      this.a($$0, $$3, $$4);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void a(bxe $$0, int $$1) {
   }

   public void b(bxe $$0, int $$1) {
      this.l.ifPresent($$1x -> $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), $$1x, $$0.dm(), 1.0F, 1.0F));
   }

   public void a(arq $$0, bxe $$1, int $$2, bwf.e $$3) {
   }

   public void a(arq $$0, bxe $$1, int $$2, buu $$3, float $$4) {
   }

   public boolean a() {
      return false;
   }

   protected String e() {
      if (this.h == null) {
         this.h = af.a("effect", mf.d.b(this));
      }

      return this.h;
   }

   public String f() {
      return this.e();
   }

   public wy g() {
      return wy.c(this.f());
   }

   public bvi h() {
      return this.e;
   }

   public int i() {
      return this.f;
   }

   public bvh a(je<byf> $$0, alg $$1, double $$2, byi.a $$3) {
      this.d.put($$0, new bvh.a($$1, $$2, $$3));
      return this;
   }

   public bvh a(int $$0) {
      return this.a($$0, $$0, $$0);
   }

   public bvh a(int $$0, int $$1, int $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      return this;
   }

   public void a(int $$0, BiConsumer<je<byf>, byi> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((je<byf>)$$2, $$3.a($$0)));
   }

   public void a(byh $$0) {
      for (Entry<je<byf>, bvh.a> $$1 : this.d.entrySet()) {
         byg $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(byh $$0, int $$1) {
      for (Entry<je<byf>, bvh.a> $$2 : this.d.entrySet()) {
         byg $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean j() {
      return this.e == bvi.a;
   }

   public lv a(bvj $$0) {
      return this.g.apply($$0);
   }

   public bvh a(awm $$0) {
      this.l = Optional.of($$0);
      return this;
   }

   public bvh a(cuk... $$0) {
      this.m = cuo.e.a($$0);
      return this;
   }

   @Override
   public cum k() {
      return this.m;
   }

   static record a(alg a, double b, byi.a c) {
      public byi a(int $$0) {
         return new byi(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}
