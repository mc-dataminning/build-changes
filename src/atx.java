import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class atx {
   private static final Logger a = LogUtils.getLogger();
   private final ata b;
   private final atx.c c;
   private final atx.a d;
   private final atc e;

   @Nullable
   public static atx a(ata $$0, atx.c $$1, atd $$2, atc $$3) {
      int $$4 = aa.b().a($$2);
      atx.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new atx($$0, $$1, $$5, $$3) : null;
   }

   public atx(ata $$0, atx.c $$1, atx.a $$2, atc $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static atx.a a(ata $$0, atx.c $$1, int $$2) {
      try {
         atx.a var11;
         try (atb $$3 = $$1.a($$0)) {
            atq $$4 = $$3.a(atq.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            asx $$5 = $$3.a(asx.a);
            cpl $$6 = $$5 != null ? $$5.a() : cpl.a();
            ayr<Integer> $$7 = a($$0.a(), $$4);
            aty $$8 = aty.a($$7, $$2);
            asz $$9 = $$3.a(asz.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new atx.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static ayr<Integer> a(String $$0, atq $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new ayr<>($$2);
      } else {
         ayr<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new ayr<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public ata a() {
      return this.b;
   }

   public xp b() {
      return this.b.b();
   }

   public xp c() {
      return this.d.a();
   }

   public xp a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public aty d() {
      return this.d.b();
   }

   public cpl e() {
      return this.d.c();
   }

   public atb f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public atc h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public atx.b k() {
      return this.e.b();
   }

   public aub l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof atx $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(xp a, aty b, cpl c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, atc> $$2, boolean $$3) {
         atx.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               atc $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               atc $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public atx.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      atb a(ata var1);

      atb a(ata var1, atx.a var2);
   }
}
