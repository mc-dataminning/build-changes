import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bhr {
   private final Map<bjy, bhm> a = Maps.newHashMap();
   private final bhs b;
   private final int c;
   @Nullable
   private String d;
   private Supplier<bht.a> e = () -> null;

   @Nullable
   public static bhr a(int $$0) {
      return jc.e.a($$0);
   }

   public static int a(bhr $$0) {
      return jc.e.a($$0);
   }

   public static int b(@Nullable bhr $$0) {
      return jc.e.a($$0);
   }

   protected bhr(bhs $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Optional<bht.a> b() {
      return Optional.ofNullable(this.e.get());
   }

   public void a(biw $$0, int $$1) {
   }

   public void a(@Nullable big $$0, @Nullable big $$1, biw $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(biw $$0, int $$1) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.d == null) {
         this.d = ac.a("effect", jc.e.b(this));
      }

      return this.d;
   }

   public String d() {
      return this.c();
   }

   public te e() {
      return te.c(this.d());
   }

   public bhs f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bhr a(bjy $$0, String $$1, double $$2, bkb.a $$3) {
      this.a.put($$0, new bhr.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bhr a(Supplier<bht.a> $$0) {
      this.e = $$0;
      return this;
   }

   public Map<bjy, bhm> h() {
      return this.a;
   }

   public void a(bka $$0) {
      for (Entry<bjy, bhm> $$1 : this.a.entrySet()) {
         bjz $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bka $$0, int $$1) {
      for (Entry<bjy, bhm> $$2 : this.a.entrySet()) {
         bjz $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.c($$2.getValue().a($$1));
         }
      }
   }

   public boolean i() {
      return this.b == bhs.a;
   }

   class a implements bhm {
      private final UUID b;
      private final double c;
      private final bkb.a d;

      public a(UUID $$0, double $$1, bkb.a $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public UUID a() {
         return this.b;
      }

      @Override
      public bkb a(int $$0) {
         return new bkb(this.b, bhr.this.d() + " " + $$0, this.c * (double)($$0 + 1), this.d);
      }
   }
}
