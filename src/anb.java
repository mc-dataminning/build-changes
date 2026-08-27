import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class anb {
   private static final Logger a = LogUtils.getLogger();
   private final String b;
   private final anb.c c;
   private final tl d;
   private final anb.a e;
   private final anb.b f;
   private final boolean g;
   private final boolean h;
   private final anf i;

   @Nullable
   public static anb a(String $$0, tl $$1, boolean $$2, anb.c $$3, ami $$4, anb.b $$5, anf $$6) {
      int $$7 = aa.b().a($$4);
      anb.a $$8 = a($$0, $$3, $$7);
      return $$8 != null ? a($$0, $$1, $$2, $$3, $$8, $$5, false, $$6) : null;
   }

   public static anb a(String $$0, tl $$1, boolean $$2, anb.c $$3, anb.a $$4, anb.b $$5, boolean $$6, anf $$7) {
      return new anb($$0, $$2, $$3, $$1, $$4, $$5, $$6, $$7);
   }

   private anb(String $$0, boolean $$1, anb.c $$2, tl $$3, anb.a $$4, anb.b $$5, boolean $$6, anf $$7) {
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
   public static anb.a a(String $$0, anb.c $$1, int $$2) {
      try {
         anb.a var11;
         try (amh $$3 = $$1.a($$0)) {
            amv $$4 = $$3.a(amv.b);
            if ($$4 == null) {
               a.warn("Missing metadata in pack {}", $$0);
               return null;
            }

            ame $$5 = $$3.a(ame.a);
            cec $$6 = $$5 != null ? $$5.a() : cec.a();
            arp<Integer> $$7 = a($$0, $$4);
            anc $$8 = anc.a($$7, $$2);
            amg $$9 = $$3.a(amg.a);
            List<String> $$10 = $$9 != null ? $$9.a($$2) : List.of();
            var11 = new anb.a($$4.a(), $$8, $$6, $$10);
         }

         return var11;
      } catch (Exception var14) {
         a.warn("Failed to read pack {} metadata", $$0, var14);
         return null;
      }
   }

   private static arp<Integer> a(String $$0, amv $$1) {
      int $$2 = $$1.b();
      if ($$1.c().isEmpty()) {
         return new arp<>($$2);
      } else {
         arp<Integer> $$3 = $$1.c().get();
         if (!$$3.a($$2)) {
            a.warn("Pack {} declared support for versions {} but declared main format is {}, defaulting to {}", new Object[]{$$0, $$3, $$2, $$2});
            return new arp<>($$2);
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

   public anc c() {
      return this.e.b();
   }

   public cec d() {
      return this.e.c();
   }

   public amh e() {
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

   public anb.b i() {
      return this.f;
   }

   public anf j() {
      return this.i;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof anb $$1) ? false : this.b.equals($$1.b);
      }
   }

   @Override
   public int hashCode() {
      return this.b.hashCode();
   }

   public static record a(tl a, anc b, cec c, List<String> d) {
   }

   public static enum b {
      a,
      b;

      public <T> int a(List<T> $$0, T $$1, Function<T, anb> $$2, boolean $$3) {
         anb.b $$4 = $$3 ? this.a() : this;
         if ($$4 == b) {
            int $$5;
            for ($$5 = 0; $$5 < $$0.size(); $$5++) {
               anb $$6 = $$2.apply($$0.get($$5));
               if (!$$6.h() || $$6.i() != this) {
                  break;
               }
            }

            $$0.add($$5, $$1);
            return $$5;
         } else {
            int $$7;
            for ($$7 = $$0.size() - 1; $$7 >= 0; $$7--) {
               anb $$8 = $$2.apply($$0.get($$7));
               if (!$$8.h() || $$8.i() != this) {
                  break;
               }
            }

            $$0.add($$7 + 1, $$1);
            return $$7 + 1;
         }
      }

      public anb.b a() {
         return this == a ? b : a;
      }
   }

   public interface c {
      amh a(String var1);

      amh a(String var1, anb.a var2);
   }
}
