import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class asz {
   private static final Logger a = LogUtils.getLogger();
   private final asc b;
   private final asz.c c;
   private final asz.a d;
   private final ase e;

   @Nullable
   public static asz a(asc $$0, asz.c $$1, asf $$2, ase $$3) {
      int $$4 = aa.b().a($$2);
      asz.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new asz($$0, $$1, $$5, $$3) : null;
   }

   public asz(asc $$0, asz.c $$1, asz.a $$2, ase $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static asz.a a(asc $$0, asz.c $$1, int $$2) {
      try {
         asz.a var11;
         try (asd $$3 = $$1.a($$0)) {
            ass $$4 = $$3.a(ass.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            arz $$5 = $$3.a(arz.a);
            cnu $$6 = $$5 != null ? $$5.a() : cnu.a();
            axr<Integer> $$7 = a($$0.a(), $$4);
            ata $$8 = ata.a($$7, $$2);
            asb $$9 = $$3.a(asb.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new asz.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static axr<Integer> a(String $$0, ass $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new axr<>($$2);
      } else {
         axr<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new axr<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public asc a() {
      return this.b;
   }

   public wu b() {
      return this.b.b();
   }

   public wu c() {
      return this.d.a();
   }

   public wu a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public ata d() {
      return this.d.b();
   }

   public cnu e() {
      return this.d.c();
   }

   public asd f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public ase h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public asz.b k() {
      return this.e.b();
   }

   public atd l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof asz $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(wu a, ata b, cnu c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, ase> $$2, boolean $$3) {
         asz.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               ase $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               ase $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public asz.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      asd a(asc var1);

      asd a(asc var1, asz.a var2);
   }
}
