import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class amx {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final amx.c c;
   private final ti d;
   private final amx.a e;
   private final amx.b f;
   private final boolean g;
   private final boolean h;
   private final anb i;

   @Nullable
   public static amx a(String $$0, ti $$1, boolean $$2, amx.c $$3, ame $$4, amx.b $$5, anb $$6) {
      int $$7 = aa.b().a($$4);
      amx.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static amx a(String $$0, ti $$1, boolean $$2, amx.c $$3, amx.a $$4, amx.b $$5, boolean $$6, anb $$7) {
      return new amx($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private amx(String $$0, boolean $$1, amx.c $$2, ti $$3, amx.a $$4, amx.b $$5, boolean $$6, anb $$7) {
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
   public static amx.a a(String $$0, amx.c $$1, int $$2) {
      try {
         amx.a var11;
         try (amd $$3 = $$1.a($$0)) {
            amr $$4 = $$3.a(amr.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            ama $$5 = $$3.a(ama.a);
            cdx $$6 = $$5 != null ? $$5.a() : cdx.a();
            arl<Integer> $$7 = a($$0, $$4);
            amy $$8 = amy.a($$7, $$2);
            amc $$9 = $$3.a(amc.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new amx.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static arl<Integer> a(String $$0, amr $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new arl<>($$2);
      } else {
         arl<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new arl<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public ti a() {
      return this.d;
   }

   public ti b() {
      return this.e.a();
   }

   public ti a(boolean $$0) {
      return tk.a(this.i.a(ti.b(this.b)))
         .a($$1 -> $$1.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.b)).a(new tn(tn.a.a, ti.h().b(this.d).f("\n").b(this.e.a))));
   }

   public amy c() {
      return this.e.b();
   }

   public cdx d() {
      return this.e.c();
   }

   public amd e() {
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

   public amx.b i() {
      return this.f;
   }

   public anb j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof amx $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(ti a, amy b, cdx c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, amx> $$2, boolean $$3) {
         amx.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               amx $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               amx $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public amx.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      amd a(String var1);

      amd a(String var1, amx.a var2);
   }
}
