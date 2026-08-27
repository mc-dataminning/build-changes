import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bey {
   private final Map<bhb, bhe> a = Maps.newHashMap();
   private final bez b;
   private final int c;
   @Nullable
   private String d;
   private Supplier<bfa.a> e = () -> null;

   @Nullable
   public static bey a(int $$0) {
      return jb.e.a($$0);
   }

   public static int a(bey $$0) {
      return jb.e.a($$0);
   }

   public static int b(@Nullable bey $$0) {
      return jb.e.a($$0);
   }

   protected bey(bez $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Optional<bfa.a> b() {
      return Optional.ofNullable(this.e.get());
   }

   public void a(bfz $$0, int $$1) {
      if (this == bfc.j) {
         if ($$0.er() < $$0.eI()) {
            $$0.s(1.0F);
         }
      } else if (this == bfc.s) {
         if ($$0.er() > 1.0F) {
            $$0.a($$0.dJ().o(), 1.0F);
         }
      } else if (this == bfc.t) {
         $$0.a($$0.dJ().p(), 1.0F);
      } else if (this == bfc.q && $$0 instanceof byo) {
         ((byo)$$0).z(0.005F * (float)($$1 + 1));
      } else if (this == bfc.w && $$0 instanceof byo) {
         if (!$$0.dI().B) {
            ((byo)$$0).fX().a($$1 + 1, 1.0F);
         }
      } else if ((this != bfc.f || $$0.eq()) && (this != bfc.g || !$$0.eq())) {
         if (this == bfc.g && !$$0.eq() || this == bfc.f && $$0.eq()) {
            $$0.a($$0.dJ().o(), (float)(6 << $$1));
         }
      } else {
         $$0.s((float)Math.max(4 << $$1, 0));
      }
   }

   public void a(@Nullable bfj $$0, @Nullable bfj $$1, bfz $$2, int $$3, double $$4) {
      if ((this != bfc.f || $$2.eq()) && (this != bfc.g || !$$2.eq())) {
         if (this == bfc.g && !$$2.eq() || this == bfc.f && $$2.eq()) {
            int $$6 = (int)($$4 * (double)(6 << $$3) + 0.5);
            if ($$0 == null) {
               $$2.a($$2.dJ().o(), (float)$$6);
            } else {
               $$2.a($$2.dJ().c($$0, $$1), (float)$$6);
            }
         } else {
            this.a($$2, $$3);
         }
      } else {
         int $$5 = (int)($$4 * (double)(4 << $$3) + 0.5);
         $$2.s((float)$$5);
      }
   }

   public boolean a(int $$0, int $$1) {
      if (this == bfc.j) {
         int $$2 = 50 >> $$1;
         return $$2 > 0 ? $$0 % $$2 == 0 : true;
      } else if (this == bfc.s) {
         int $$3 = 25 >> $$1;
         return $$3 > 0 ? $$0 % $$3 == 0 : true;
      } else if (this == bfc.t) {
         int $$4 = 40 >> $$1;
         return $$4 > 0 ? $$0 % $$4 == 0 : true;
      } else {
         return this == bfc.q;
      }
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.d == null) {
         this.d = ac.a("effect", jb.e.b(this));
      }

      return this.d;
   }

   public String d() {
      return this.c();
   }

   public sw e() {
      return sw.c(this.d());
   }

   public bez f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bey a(bhb $$0, String $$1, double $$2, bhe.a $$3) {
      bhe $$4 = new bhe(UUID.fromString($$1), this::d, $$2, $$3);
      this.a.put($$0, $$4);
      return this;
   }

   public bey a(Supplier<bfa.a> $$0) {
      this.e = $$0;
      return this;
   }

   public Map<bhb, bhe> h() {
      return this.a;
   }

   public void a(bfz $$0, bhd $$1, int $$2) {
      for (Entry<bhb, bhe> $$3 : this.a.entrySet()) {
         bhc $$4 = $$1.a($$3.getKey());
         if ($$4 != null) {
            $$4.d($$3.getValue());
         }
      }
   }

   public void b(bfz $$0, bhd $$1, int $$2) {
      for (Entry<bhb, bhe> $$3 : this.a.entrySet()) {
         bhc $$4 = $$1.a($$3.getKey());
         if ($$4 != null) {
            bhe $$5 = $$3.getValue();
            $$4.d($$5);
            $$4.c(new bhe($$5.a(), this.d() + " " + $$2, this.a($$2, $$5), $$5.c()));
         }
      }
   }

   public double a(int $$0, bhe $$1) {
      return $$1.d() * (double)($$0 + 1);
   }

   public boolean i() {
      return this.b == bez.a;
   }
}
