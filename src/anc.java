import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class anc {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final anc.c c;
   private final tl d;
   private final anc.a e;
   private final anc.b f;
   private final boolean g;
   private final boolean h;
   private final ang i;

   @Nullable
   public static anc a(String $$0, tl $$1, boolean $$2, anc.c $$3, amj $$4, anc.b $$5, ang $$6) {
      int $$7 = aa.b().a($$4);
      anc.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static anc a(String $$0, tl $$1, boolean $$2, anc.c $$3, anc.a $$4, anc.b $$5, boolean $$6, ang $$7) {
      return new anc($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private anc(String $$0, boolean $$1, anc.c $$2, tl $$3, anc.a $$4, anc.b $$5, boolean $$6, ang $$7) {
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
   public static anc.a a(String $$0, anc.c $$1, int $$2) {
      try {
         anc.a var11;
         try (ami $$3 = $$1.a($$0)) {
            amw $$4 = $$3.a(amw.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            amf $$5 = $$3.a(amf.a);
            cec $$6 = $$5 != null ? $$5.a() : cec.a();
            arq<Integer> $$7 = a($$0, $$4);
            and $$8 = and.a($$7, $$2);
            amh $$9 = $$3.a(amh.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new anc.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static arq<Integer> a(String $$0, amw $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new arq<>($$2);
      } else {
         arq<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new arq<>($$2);
         } else {
            return $$3;
         }
      }
   }

   public tl a() {
      return this.d;
   }

   public tl b() {
      return this.e.a();
   }

   public tl a(boolean $$0) {
      return tn.a(this.i.a(tl.b(this.b)))
         .a($$1 -> $$1.a($$0 ? n.k : n.m).a(StringArgumentType.escapeIfRequired(this.b)).a(new tq(tq.a.a, tl.h().b(this.d).f("\n").b(this.e.a))));
   }

   public and c() {
      return this.e.b();
   }

   public cec d() {
      return this.e.c();
   }

   public ami e() {
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

   public anc.b i() {
      return this.f;
   }

   public ang j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof anc $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(tl a, and b, cec c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, anc> $$2, boolean $$3) {
         anc.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               anc $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               anc $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public anc.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      ami a(String var1);

      ami a(String var1, anc.a var2);
   }
}
