import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aua {
   private static final Logger a = LogUtils.getLogger();
   private final atd b;
   private final aua.c c;
   private final aua.a d;
   private final atf e;

   @Nullable
   public static aua a(atd $$0, aua.c $$1, atg $$2, atf $$3) {
      int $$4 = ab.b().a($$2);
      aua.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new aua($$0, $$1, $$5, $$3) : null;
   }

   public aua(atd $$0, aua.c $$1, aua.a $$2, atf $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static aua.a a(atd $$0, aua.c $$1, int $$2) {
      try {
         aua.a var11;
         try (ate $$3 = $$1.a($$0)) {
            att $$4 = $$3.a(att.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            ata $$5 = $$3.a(ata.a);
            cqh $$6 = $$5 != null ? $$5.a() : cqh.a();
            ayu<Integer> $$7 = a($$0.a(), $$4);
            aub $$8 = aub.a($$7, $$2);
            atc $$9 = $$3.a(atc.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new aua.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static ayu<Integer> a(String $$0, att $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new ayu<>($$2);
      } else {
         ayu<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new ayu<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public atd a() {
      return this.b;
   }

   public xd b() {
      return this.b.b();
   }

   public xd c() {
      return this.d.a();
   }

   public xd a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public aub d() {
      return this.d.b();
   }

   public cqh e() {
      return this.d.c();
   }

   public ate f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public atf h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public aua.b k() {
      return this.e.b();
   }

   public aue l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof aua $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(xd a, aub b, cqh c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, atf> $$2, boolean $$3) {
         aua.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               atf $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               atf $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public aua.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      ate a(atd var1);

      ate a(atd var1, aua.a var2);
   }
}
