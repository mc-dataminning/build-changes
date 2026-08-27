import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bid {
   private final Map<bkj, bhy> a = Maps.newHashMap();
   private final bie b;
   private final int c;
   @Nullable
   private String d;
   private Supplier<bif.a> e = () -> null;
   private final hg.c<bid> f = jd.e.f(this);

   protected bid(bie $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Optional<bif.a> b() {
      return Optional.ofNullable(this.e.get());
   }

   public void a(bji $$0, int $$1) {
   }

   public void a(@Nullable bis $$0, @Nullable bis $$1, bji $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bji $$0, int $$1) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.d == null) {
         this.d = ac.a("effect", jd.e.b(this));
      }

      return this.d;
   }

   public String d() {
      return this.c();
   }

   public tn e() {
      return tn.c(this.d());
   }

   public bie f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bid a(bkj $$0, String $$1, double $$2, bkm.a $$3) {
      this.a.put($$0, new bid.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bid a(Supplier<bif.a> $$0) {
      this.e = $$0;
      return this;
   }

   public Map<bkj, bhy> h() {
      return this.a;
   }

   public void a(bkl $$0) {
      for (Entry<bkj, bhy> $$1 : this.a.entrySet()) {
         bkk $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bkl $$0, int $$1) {
      for (Entry<bkj, bhy> $$2 : this.a.entrySet()) {
         bkk $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.c($$2.getValue().a($$1));
         }
      }
   }

   public boolean i() {
      return this.b == bie.a;
   }

   @Deprecated
   public hg.c<bid> j() {
      return this.f;
   }

   class a implements bhy {
      private final UUID b;
      private final double c;
      private final bkm.a d;

      public a(UUID $$0, double $$1, bkm.a $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public UUID a() {
         return this.b;
      }

      @Override
      public bkm a(int $$0) {
         return new bkm(this.b, bid.this.d() + " " + $$0, this.c * (double)($$0 + 1), this.d);
      }
   }
}
