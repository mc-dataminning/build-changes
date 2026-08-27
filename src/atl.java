import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class atl {
   private static final Logger a = LogUtils.getLogger();
   private final aso b;
   private final atl.c c;
   private final atl.a d;
   private final asq e;

   @Nullable
   public static atl a(aso $$0, atl.c $$1, asr $$2, asq $$3) {
      int $$4 = ab.b().a($$2);
      atl.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new atl($$0, $$1, $$5, $$3) : null;
   }

   public atl(aso $$0, atl.c $$1, atl.a $$2, asq $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static atl.a a(aso $$0, atl.c $$1, int $$2) {
      try {
         atl.a var11;
         try (asp $$3 = $$1.a($$0)) {
            ate $$4 = $$3.a(ate.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            asl $$5 = $$3.a(asl.a);
            cop $$6 = $$5 != null ? $$5.a() : cop.a();
            aye<Integer> $$7 = a($$0.a(), $$4);
            atm $$8 = atm.a($$7, $$2);
            asn $$9 = $$3.a(asn.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new atl.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static aye<Integer> a(String $$0, ate $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new aye<>($$2);
      } else {
         aye<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new aye<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public aso a() {
      return this.b;
   }

   public xe b() {
      return this.b.b();
   }

   public xe c() {
      return this.d.a();
   }

   public xe a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public atm d() {
      return this.d.b();
   }

   public cop e() {
      return this.d.c();
   }

   public asp f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public asq h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public atl.b k() {
      return this.e.b();
   }

   public atp l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof atl $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(xe a, atm b, cop c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, asq> $$2, boolean $$3) {
         atl.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               asq $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               asq $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public atl.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      asp a(aso var1);

      asp a(aso var1, atl.a var2);
   }
}
