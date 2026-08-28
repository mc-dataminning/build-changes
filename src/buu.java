import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class buu implements ctb {
   public static final Codec<js<buu>> a = md.d.r();
   public static final yt<wg, js<buu>> b = yr.b(me.W);
   private static final int c = azk.d(38.25F);
   private final Map<js<bxs>, buu.a> d = new Object2ObjectOpenHashMap();
   private final buv e;
   private final int f;
   private final Function<buw, lt> g;
   @Nullable
   private String h;
   private int i;
   private int j;
   private int k;
   private Optional<awj> l = Optional.empty();
   private cte m = ctg.g;

   protected buu(buv $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lo.a(lv.u, axu.c($$2, $$1));
      };
   }

   protected buu(buv $$0, int $$1, lt $$2) {
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

   public boolean a(arn $$0, bwr $$1, int $$2) {
      return true;
   }

   public void a(arn $$0, @Nullable bvs $$1, @Nullable bvs $$2, bwr $$3, int $$4, double $$5) {
      this.a($$0, $$3, $$4);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void a(bwr $$0, int $$1) {
   }

   public void b(bwr $$0, int $$1) {
      this.l.ifPresent($$1x -> $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), $$1x, $$0.dm(), 1.0F, 1.0F));
   }

   public void a(arn $$0, bwr $$1, int $$2, bvs.e $$3) {
   }

   public void a(arn $$0, bwr $$1, int $$2, buh $$3, float $$4) {
   }

   public boolean a() {
      return false;
   }

   protected String e() {
      if (this.h == null) {
         this.h = af.a("effect", md.d.b(this));
      }

      return this.h;
   }

   public String f() {
      return this.e();
   }

   public wv g() {
      return wv.c(this.f());
   }

   public buv h() {
      return this.e;
   }

   public int i() {
      return this.f;
   }

   public buu a(js<bxs> $$0, ald $$1, double $$2, bxv.a $$3) {
      this.d.put($$0, new buu.a($$1, $$2, $$3));
      return this;
   }

   public buu a(int $$0) {
      return this.a($$0, $$0, $$0);
   }

   public buu a(int $$0, int $$1, int $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      return this;
   }

   public void a(int $$0, BiConsumer<js<bxs>, bxv> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((js<bxs>)$$2, $$3.a($$0)));
   }

   public void a(bxu $$0) {
      for (Entry<js<bxs>, buu.a> $$1 : this.d.entrySet()) {
         bxt $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bxu $$0, int $$1) {
      for (Entry<js<bxs>, buu.a> $$2 : this.d.entrySet()) {
         bxt $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean j() {
      return this.e == buv.a;
   }

   public lt a(buw $$0) {
      return this.g.apply($$0);
   }

   public buu a(awj $$0) {
      this.l = Optional.of($$0);
      return this;
   }

   public buu a(ctc... $$0) {
      this.m = ctg.e.a($$0);
      return this;
   }

   @Override
   public cte k() {
      return this.m;
   }

   static record a(ald a, double b, bxv.a c) {
      public bxv a(int $$0) {
         return new bxv(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}
