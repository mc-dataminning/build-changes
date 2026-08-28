import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class avd {
   private static final Logger a = LogUtils.getLogger();
   private final auf b;
   private final avd.c c;
   private final avd.a d;
   private final auh e;

   @Nullable
   public static avd a(auf $$0, avd.c $$1, aui $$2, auh $$3) {
      int $$4 = ab.b().a($$2);
      avd.a $$5 = a($$0, $$1, $$4);
      return $$5 != null ? new avd($$0, $$1, $$5, $$3) : null;
   }

   public avd(auf $$0, avd.c $$1, avd.a $$2, auh $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Nullable
   public static avd.a a(auf $$0, avd.c $$1, int $$2) {
      try {
         avd.a var11;
         try (aug $$3 = $$1.a($$0)) {
            auv $$4 = $$3.a(auv.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0.a());
               return null;
            }

            auc $$5 = $$3.a(auc.a);
            css $$6 = $$5 != null ? $$5.a() : css.a();
            azw<Integer> $$7 = a($$0.a(), $$4);
            ave $$8 = ave.a($$7, $$2);
            aue $$9 = $$3.a(aue.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new avd.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0.a(), var14);
         return null;
      }
   }

   private static azw<Integer> a(String $$0, auv $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new azw<>($$2);
      } else {
         azw<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new azw<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public auf a() {
      return this.b;
   }

   public xv b() {
      return this.b.b();
   }

   public xv c() {
      return this.d.a();
   }

   public xv a(boolean $$0) {
      return this.b.a($$0, this.d.a);
   }

   public ave d() {
      return this.d.b();
   }

   public css e() {
      return this.d.c();
   }

   public aug f() {
      return this.c.a(this.b, this.d);
   }

   public String g() {
      return this.b.a();
   }

   public auh h() {
      return this.e;
   }

   public boolean i() {
      return this.e.a();
   }

   public boolean j() {
      return this.e.c();
   }

   public avd.b k() {
      return this.e.b();
   }

   public avh l() {
      return this.b.c();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof avd $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(xv a, ave b, css c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, auh> $$2, boolean $$3) {
         avd.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               auh $$6 = $$2.apply($$0.get($$5));
               if (!$$6.c() || $$6.b() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               auh $$8 = $$2.apply($$0.get($$7));
               if (!$$8.c() || $$8.b() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public avd.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      aug a(auf var1);

      aug a(auf var1, avd.a var2);
   }
}
