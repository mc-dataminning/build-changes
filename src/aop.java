import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aop {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final aop.c c;
   private final ur d;
   private final aop.a e;
   private final aop.b f;
   private final boolean g;
   private final boolean h;
   private final aot i;

   @Nullable
   public static aop a(String $$0, ur $$1, boolean $$2, aop.c $$3, anw $$4, aop.b $$5, aot $$6) {
      int $$7 = aa.b().a($$4);
      aop.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static aop a(String $$0, ur $$1, boolean $$2, aop.c $$3, aop.a $$4, aop.b $$5, boolean $$6, aot $$7) {
      return new aop($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private aop(String $$0, boolean $$1, aop.c $$2, ur $$3, aop.a $$4, aop.b $$5, boolean $$6, aot $$7) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.g = $$1;
      this.f = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   @Nullable
   public static aop.a a(String $$0, aop.c $$1, int $$2) {
      try {
         aop.a var11;
         try (anv $$3 = $$1.a($$0)) {
            aoj $$4 = $$3.a(aoj.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            ans $$5 = $$3.a(ans.a);
            cgd $$6 = $$5 != null ? $$5.a() : cgd.a();
            ate<Integer> $$7 = a($$0, $$4);
            aoq $$8 = aoq.a($$7, $$2);
            anu $$9 = $$3.a(anu.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new aop.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static ate<Integer> a(String $$0, aoj $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new ate<>($$2);
      } else {
         ate<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new ate<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public ur a() {
      return this.d;
   }

   public ur b() {
      return this.e.a();
   }

   public ur a(boolean $$0) {
      return uu.a(this.i.a(ur.b(this.b)))
         .a($$1 -> $$1.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.b)).a(new ux(ux.a.a, ur.i().b(this.d).f("\n").b(this.e.a))));
   }

   public aoq c() {
      return this.e.b();
   }

   public cgd d() {
      return this.e.c();
   }

   public anv e() {
      return this.c.a(this.b, this.e);
   }

   public String f() {
      return this.b;
   }

   public boolean g() {
      return this.g;
   }

   public boolean h() {
      return this.h;
   }

   public aop.b i() {
      return this.f;
   }

   public aot j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof aop $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(ur a, aoq b, cgd c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, aop> $$2, boolean $$3) {
         aop.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               aop $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               aop $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public aop.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      anv a(String var1);

      anv a(String var1, aop.a var2);
   }
}
