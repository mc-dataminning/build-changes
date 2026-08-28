import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bvc implements cty {
   public static final Codec<je<bvc>> a = mf.d.r();
   public static final yu<wh, je<bvc>> b = ys.b(mg.W);
   private static final int c = azk.d(38.25F);
   private final Map<je<bya>, bvc.a> d = new Object2ObjectOpenHashMap();
   private final bvd e;
   private final int f;
   private final Function<bve, lv> g;
   @Nullable
   private String h;
   private int i;
   private int j;
   private int k;
   private Optional<awk> l = Optional.empty();
   private cub m = cud.g;

   protected bvc(bvd $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lq.a(lx.u, axu.c($$2, $$1));
      };
   }

   protected bvc(bvd $$0, int $$1, lv $$2) {
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

   public boolean a(aro $$0, bwz $$1, int $$2) {
      return true;
   }

   public void a(aro $$0, @Nullable bwa $$1, @Nullable bwa $$2, bwz $$3, int $$4, double $$5) {
      this.a($$0, $$3, $$4);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void a(bwz $$0, int $$1) {
   }

   public void b(bwz $$0, int $$1) {
      this.l.ifPresent($$1x -> $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), $$1x, $$0.dm(), 1.0F, 1.0F));
   }

   public void a(aro $$0, bwz $$1, int $$2, bwa.e $$3) {
   }

   public void a(aro $$0, bwz $$1, int $$2, bup $$3, float $$4) {
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

   public ww g() {
      return ww.c(this.f());
   }

   public bvd h() {
      return this.e;
   }

   public int i() {
      return this.f;
   }

   public bvc a(je<bya> $$0, ale $$1, double $$2, byd.a $$3) {
      this.d.put($$0, new bvc.a($$1, $$2, $$3));
      return this;
   }

   public bvc a(int $$0) {
      return this.a($$0, $$0, $$0);
   }

   public bvc a(int $$0, int $$1, int $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      return this;
   }

   public void a(int $$0, BiConsumer<je<bya>, byd> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((je<bya>)$$2, $$3.a($$0)));
   }

   public void a(byc $$0) {
      for (Entry<je<bya>, bvc.a> $$1 : this.d.entrySet()) {
         byb $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(byc $$0, int $$1) {
      for (Entry<je<bya>, bvc.a> $$2 : this.d.entrySet()) {
         byb $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean j() {
      return this.e == bvd.a;
   }

   public lv a(bve $$0) {
      return this.g.apply($$0);
   }

   public bvc a(awk $$0) {
      this.l = Optional.of($$0);
      return this;
   }

   public bvc a(ctz... $$0) {
      this.m = cud.e.a($$0);
      return this;
   }

   @Override
   public cub k() {
      return this.m;
   }

   static record a(ale a, double b, byd.a c) {
      public byd a(int $$0) {
         return new byd(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}
