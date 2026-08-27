import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bib {
   private final Map<bkh, bhw> a = Maps.newHashMap();
   private final bic b;
   private final int c;
   @Nullable
   private String d;
   private Supplier<bid.a> e = () -> null;
   private final hg.c<bib> f = jd.e.f(this);

   protected bib(bic $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Optional<bid.a> b() {
      return Optional.ofNullable(this.e.get());
   }

   public void a(bjg $$0, int $$1) {
   }

   public void a(@Nullable biq $$0, @Nullable biq $$1, bjg $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bjg $$0, int $$1) {
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

   public tl e() {
      return tl.c(this.d());
   }

   public bic f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bib a(bkh $$0, String $$1, double $$2, bkk.a $$3) {
      this.a.put($$0, new bib.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bib a(Supplier<bid.a> $$0) {
      this.e = $$0;
      return this;
   }

   public Map<bkh, bhw> h() {
      return this.a;
   }

   public void a(bkj $$0) {
      for (Entry<bkh, bhw> $$1 : this.a.entrySet()) {
         bki $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bkj $$0, int $$1) {
      for (Entry<bkh, bhw> $$2 : this.a.entrySet()) {
         bki $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.c($$2.getValue().a($$1));
         }
      }
   }

   public boolean i() {
      return this.b == bic.a;
   }

   @Deprecated
   public hg.c<bib> j() {
      return this.f;
   }

   class a implements bhw {
      private final UUID b;
      private final double c;
      private final bkk.a d;

      public a(UUID $$0, double $$1, bkk.a $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public UUID a() {
         return this.b;
      }

      @Override
      public bkk a(int $$0) {
         return new bkk(this.b, bib.this.d() + " " + $$0, this.c * (double)($$0 + 1), this.d);
      }
   }
}
