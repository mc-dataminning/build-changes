import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class brm implements cov {
   private static final int a = ayg.d(38.25F);
   private final Map<jj<bue>, brm.a> b = new Object2ObjectOpenHashMap();
   private final brn c;
   private final int d;
   private final Function<bro, lh> e;
   @Nullable
   private String f;
   private int g;
   private Optional<avg> h = Optional.empty();
   private coy i = cpa.f;

   protected brm(brn $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> {
         int $$2 = $$1x.f() ? a : 255;
         return lc.a(lj.u, axq.b.b($$2, $$1));
      };
   }

   protected brm(brn $$0, int $$1, lh $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> $$2;
   }

   public int b() {
      return this.g;
   }

   public boolean a(btb $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bsg $$0, @Nullable bsg $$1, btb $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(btb $$0, int $$1) {
   }

   public void c(btb $$0, int $$1) {
      this.h.ifPresent($$1x -> $$0.dQ().a(null, $$0.dv(), $$0.dx(), $$0.dB(), $$1x, $$0.df(), 1.0F, 1.0F));
   }

   public void a(btb $$0, int $$1, bsg.c $$2) {
   }

   public void a(btb $$0, int $$1, bqz $$2, float $$3) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.f == null) {
         this.f = ac.a("effect", lq.d.b(this));
      }

      return this.f;
   }

   public String d() {
      return this.c();
   }

   public wu e() {
      return wu.c(this.d());
   }

   public brn f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public brm a(jj<bue> $$0, String $$1, double $$2, buh.a $$3) {
      this.b.put($$0, new brm.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public brm a(int $$0) {
      this.g = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jj<bue>, buh> $$1) {
      this.b.forEach(($$2, $$3) -> $$1.accept((jj<bue>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(bug $$0) {
      for (Entry<jj<bue>, brm.a> $$1 : this.b.entrySet()) {
         buf $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bug $$0, int $$1) {
      for (Entry<jj<bue>, brm.a> $$2 : this.b.entrySet()) {
         buf $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.c == brn.a;
   }

   public lh a(bro $$0) {
      return this.e.apply($$0);
   }

   public brm a(avg $$0) {
      this.h = Optional.of($$0);
      return this;
   }

   public brm a(cow... $$0) {
      this.i = cpa.d.a($$0);
      return this;
   }

   @Override
   public coy i() {
      return this.i;
   }

   static record a(UUID a, double b, buh.a c) {
      public buh a(String $$0, int $$1) {
         return new buh(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
