import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class att {
   private static final Logger a = LogUtils.getLogger();
   private final asw b;
   private final att.c c;
   private final att.a d;
   private final asy e;

   @Nullable
   public static att a(asw $$0, att.c $$1, asz $$2, asy $$3) {
      int $$4 = aa.b().a($$2);
      att.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new att($$0, $$1, $$5, $$3) : null;
   }

   public att(asw $$0, att.c $$1, att.a $$2, asy $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static att.a a(asw $$0, att.c $$1, int $$2) {
      try {
         att.a var11;
         try (asx $$3 = $$1.a($$0)) {
            atm $$4 = $$3.a(atm.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            ast $$5 = $$3.a(ast.a);
            cpg $$6 = $$5 != null ? $$5.a() : cpg.a();
            aym<Integer> $$7 = a($$0.a(), $$4);
            atu $$8 = atu.a($$7, $$2);
            asv $$9 = $$3.a(asv.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new att.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static aym<Integer> a(String $$0, atm $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new aym<>($$2);
      } else {
         aym<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new aym<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public asw a() {
      return this.b;
   }

   public xl b() {
      return this.b.b();
   }

   public xl c() {
      return this.d.a();
   }

   public xl a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public atu d() {
      return this.d.b();
   }

   public cpg e() {
      return this.d.c();
   }

   public asx f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public asy h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public att.b k() {
      return this.e.b();
   }

   public atx l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof att $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(xl a, atu b, cpg c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, asy> $$2, boolean $$3) {
         att.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               asy $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               asy $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public att.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      asx a(asw var1);

      asx a(asw var1, att.a var2);
   }
}
