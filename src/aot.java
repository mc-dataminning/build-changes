import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class aot {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final aot.c c;
   private final uv d;
   private final aot.a e;
   private final aot.b f;
   private final boolean g;
   private final boolean h;
   private final aox i;

   @Nullable
   public static aot a(String $$0, uv $$1, boolean $$2, aot.c $$3, aoa $$4, aot.b $$5, aox $$6) {
      int $$7 = aa.b().a($$4);
      aot.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static aot a(String $$0, uv $$1, boolean $$2, aot.c $$3, aot.a $$4, aot.b $$5, boolean $$6, aox $$7) {
      return new aot($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private aot(String $$0, boolean $$1, aot.c $$2, uv $$3, aot.a $$4, aot.b $$5, boolean $$6, aox $$7) {
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
   public static aot.a a(String $$0, aot.c $$1, int $$2) {
      try {
         aot.a var11;
         try (anz $$3 = $$1.a($$0)) {
            aon $$4 = $$3.a(aon.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            anw $$5 = $$3.a(anw.a);
            cgi $$6 = $$5 != null ? $$5.a() : cgi.a();
            ati<Integer> $$7 = a($$0, $$4);
            aou $$8 = aou.a($$7, $$2);
            any $$9 = $$3.a(any.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new aot.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static ati<Integer> a(String $$0, aon $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new ati<>($$2);
      } else {
         ati<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new ati<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public uv a() {
      return this.d;
   }

   public uv b() {
      return this.e.a();
   }

   public uv a(boolean $$0) {
      return uy.a(this.i.a(uv.b(this.b)))
         .a($$1 -> $$1.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.b)).a(new vb(vb.a.a, uv.i().b(this.d).f("\n").b(this.e.a))));
   }

   public aou c() {
      return this.e.b();
   }

   public cgi d() {
      return this.e.c();
   }

   public anz e() {
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

   public aot.b i() {
      return this.f;
   }

   public aox j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof aot $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(uv a, aou b, cgi c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, aot> $$2, boolean $$3) {
         aot.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               aot $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               aot $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public aot.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      anz a(String var1);

      anz a(String var1, aot.a var2);
   }
}
