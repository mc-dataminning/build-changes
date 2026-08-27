import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class and {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final and.c c;
   private final tn d;
   private final and.a e;
   private final and.b f;
   private final boolean g;
   private final boolean h;
   private final anh i;

   @Nullable
   public static and a(String $$0, tn $$1, boolean $$2, and.c $$3, amk $$4, and.b $$5, anh $$6) {
      int $$7 = aa.b().a($$4);
      and.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static and a(String $$0, tn $$1, boolean $$2, and.c $$3, and.a $$4, and.b $$5, boolean $$6, anh $$7) {
      return new and($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private and(String $$0, boolean $$1, and.c $$2, tn $$3, and.a $$4, and.b $$5, boolean $$6, anh $$7) {
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
   public static and.a a(String $$0, and.c $$1, int $$2) {
      try {
         and.a var11;
         try (amj $$3 = $$1.a($$0)) {
            amx $$4 = $$3.a(amx.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            amg $$5 = $$3.a(amg.a);
            cee $$6 = $$5 != null ? $$5.a() : cee.a();
            arr<Integer> $$7 = a($$0, $$4);
            ane $$8 = ane.a($$7, $$2);
            ami $$9 = $$3.a(ami.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new and.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static arr<Integer> a(String $$0, amx $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new arr<>($$2);
      } else {
         arr<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new arr<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public tn a() {
      return this.d;
   }

   public tn b() {
      return this.e.a();
   }

   public tn a(boolean $$0) {
      return tp.a(this.i.a(tn.b(this.b)))
         .a($$1 -> $$1.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.b)).a(new ts(ts.a.a, tn.h().b(this.d).f("\n").b(this.e.a))));
   }

   public ane c() {
      return this.e.b();
   }

   public cee d() {
      return this.e.c();
   }

   public amj e() {
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

   public and.b i() {
      return this.f;
   }

   public anh j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof and $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(tn a, ane b, cee c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, and> $$2, boolean $$3) {
         and.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               and $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               and $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public and.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      amj a(String var1);

      amj a(String var1, and.a var2);
   }
}
