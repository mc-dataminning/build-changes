import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class atf {
   private static final Logger a = LogUtils.getLogger();
   private final asi b;
   private final atf.c c;
   private final atf.a d;
   private final ask e;

   @Nullable
   public static atf a(asi $$0, atf.c $$1, asl $$2, ask $$3) {
      int $$4 = aa.b().a($$2);
      atf.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new atf($$0, $$1, $$5, $$3) : null;
   }

   public atf(asi $$0, atf.c $$1, atf.a $$2, ask $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static atf.a a(asi $$0, atf.c $$1, int $$2) {
      try {
         atf.a var11;
         try (asj $$3 = $$1.a($$0)) {
            asy $$4 = $$3.a(asy.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            asf $$5 = $$3.a(asf.a);
            col $$6 = $$5 != null ? $$5.a() : col.a();
            axx<Integer> $$7 = a($$0.a(), $$4);
            atg $$8 = atg.a($$7, $$2);
            ash $$9 = $$3.a(ash.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new atf.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static axx<Integer> a(String $$0, asy $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new axx<>($$2);
      } else {
         axx<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new axx<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public asi a() {
      return this.b;
   }

   public wx b() {
      return this.b.b();
   }

   public wx c() {
      return this.d.a();
   }

   public wx a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public atg d() {
      return this.d.b();
   }

   public col e() {
      return this.d.c();
   }

   public asj f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public ask h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public atf.b k() {
      return this.e.b();
   }

   public atj l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof atf $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(wx a, atg b, col c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, ask> $$2, boolean $$3) {
         atf.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               ask $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               ask $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public atf.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      asj a(asi var1);

      asj a(asi var1, atf.a var2);
   }
}
