import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bhw {
   private final Map<bkc, bhr> a = Maps.newHashMap();
   private final bhx b;
   private final int c;
   @Nullable
   private String d;
   private Supplier<bhy.a> e = () -> null;
   private final hg.c<bhw> f = jd.e.f(this);

   protected bhw(bhx $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Optional<bhy.a> b() {
      return Optional.ofNullable(this.e.get());
   }

   public void a(bjb $$0, int $$1) {
   }

   public void a(@Nullable bil $$0, @Nullable bil $$1, bjb $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bjb $$0, int $$1) {
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

   public ti e() {
      return ti.c(this.d());
   }

   public bhx f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bhw a(bkc $$0, String $$1, double $$2, bkf.a $$3) {
      this.a.put($$0, new bhw.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bhw a(Supplier<bhy.a> $$0) {
      this.e = $$0;
      return this;
   }

   public Map<bkc, bhr> h() {
      return this.a;
   }

   public void a(bke $$0) {
      for (Entry<bkc, bhr> $$1 : this.a.entrySet()) {
         bkd $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bke $$0, int $$1) {
      for (Entry<bkc, bhr> $$2 : this.a.entrySet()) {
         bkd $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.c($$2.getValue().a($$1));
         }
      }
   }

   public boolean i() {
      return this.b == bhx.a;
   }

   @Deprecated
   public hg.c<bhw> j() {
      return this.f;
   }

   class a implements bhr {
      private final UUID b;
      private final double c;
      private final bkf.a d;

      public a(UUID $$0, double $$1, bkf.a $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public UUID a() {
         return this.b;
      }

      @Override
      public bkf a(int $$0) {
         return new bkf(this.b, bhw.this.d() + " " + $$0, this.c * (double)($$0 + 1), this.d);
      }
   }
}
