import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aol {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final aol.c c;
   private final ur d;
   private final aol.a e;
   private final aol.b f;
   private final boolean g;
   private final boolean h;
   private final aop i;

   @Nullable
   public static aol a(String $$0, ur $$1, boolean $$2, aol.c $$3, ans $$4, aol.b $$5, aop $$6) {
      int $$7 = aa.b().a($$4);
      aol.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static aol a(String $$0, ur $$1, boolean $$2, aol.c $$3, aol.a $$4, aol.b $$5, boolean $$6, aop $$7) {
      return new aol($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private aol(String $$0, boolean $$1, aol.c $$2, ur $$3, aol.a $$4, aol.b $$5, boolean $$6, aop $$7) {
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
   public static aol.a a(String $$0, aol.c $$1, int $$2) {
      try {
         aol.a var11;
         try (anr $$3 = $$1.a($$0)) {
            aof $$4 = $$3.a(aof.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            ano $$5 = $$3.a(ano.a);
            cfv $$6 = $$5 != null ? $$5.a() : cfv.a();
            ata<Integer> $$7 = a($$0, $$4);
            aom $$8 = aom.a($$7, $$2);
            anq $$9 = $$3.a(anq.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new aol.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static ata<Integer> a(String $$0, aof $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new ata<>($$2);
      } else {
         ata<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new ata<>($$2);
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

   public aom c() {
      return this.e.b();
   }

   public cfv d() {
      return this.e.c();
   }

   public anr e() {
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

   public aol.b i() {
      return this.f;
   }

   public aop j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof aol $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(ur a, aom b, cfv c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, aol> $$2, boolean $$3) {
         aol.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               aol $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               aol $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public aol.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      anr a(String var1);

      anr a(String var1, aol.a var2);
   }
}
