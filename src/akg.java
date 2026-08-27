import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class akg {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final akg.c c;
   private final sw d;
   private final sw e;
   private final akh f;
   private final caw g;
   private final akg.b h;
   private final boolean i;
   private final boolean j;
   private final akj k;

   @Nullable
   public static akg a(String $$0, sw $$1, boolean $$2, akg.c $$3, ajm $$4, akg.b $$5, akj $$6) {
      akg.a $$7 = a($$0, $$3);
      return $$7 != null ? a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false, $$6) : null;
   }

   public static akg a(String $$0, sw $$1, boolean $$2, akg.c $$3, akg.a $$4, ajm $$5, akg.b $$6, boolean $$7, akj $$8) {
      return new akg($$0, $$2, $$3, $$1, $$4, $$4.a($$5), $$6, $$7, $$8);
   }

   private akg(String $$0, boolean $$1, akg.c $$2, sw $$3, akg.a $$4, akh $$5, akg.b $$6, boolean $$7, akj $$8) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4.a();
      this.f = $$5;
      this.g = $$4.c();
      this.i = $$1;
      this.h = $$6;
      this.j = $$7;
      this.k = $$8;
   }

   @Nullable
   public static akg.a a(String $$0, akg.c $$1) {
      try {
         akg.a var6;
         try (ajl $$2 = $$1.open($$0)) {
            ajz $$3 = $$2.a(ajz.a);
            if ($$3 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            ajj $$4 = $$2.a(ajj.a);
            caw $$5 = $$4 != null ? $$4.a() : caw.a();
            var6 = new akg.a($$3.a(), $$3.b(), $$5);
         }

         return var6;
      } catch (Exception var9) {
         a.warn("Failed to read pack metadata", var9);
         return null;
      }
   }

   public sw a() {
      return this.d;
   }

   public sw b() {
      return this.e;
   }

   public sw a(boolean $$0) {
      return sy.a(this.k.a(sw.b(this.b)))
         .a($$1 -> $$1.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.b)).a(new tb(tb.a.a, sw.h().b(this.d).f("\n").b(this.e))));
   }

   public akh c() {
      return this.f;
   }

   public caw d() {
      return this.g;
   }

   public ajl e() {
      return this.c.open(this.b);
   }

   public String f() {
      return this.b;
   }

   public boolean g() {
      return this.i;
   }

   public boolean h() {
      return this.j;
   }

   public akg.b i() {
      return this.h;
   }

   public akj j() {
      return this.k;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof akg $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(sw a, int b, caw c) {
      public akh a(ajm $$0) {
         return akh.a(this.b, $$0);
      }
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, akg> $$2, boolean $$3) {
         akg.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               akg $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               akg $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public akg.b a() {
         return this == a ? b : a;
      }
   }

   @FunctionalInterface
   public interface c {
      ajl open(String var1);
   }
}
