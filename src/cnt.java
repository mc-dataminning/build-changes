import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;
import javax.annotation.Nullable;

public class cnt {
   private final String a;
   @Nullable
   private dnd b;
   private boolean c;
   private boolean d;

   public cnt(String $$0) {
      this.a = $$0;
   }

   private static boolean a(dnd $$0, @Nullable dnd $$1, boolean $$2) {
      if ($$1 == null || $$0.a() != $$1.a()) {
         return false;
      } else if (!$$2) {
         return true;
      } else if ($$0.b() == null && $$1.b() == null) {
         return true;
      } else if ($$0.b() != null && $$1.b() != null) {
         iz $$3 = $$0.c().H_();
         return Objects.equals($$0.b().c($$3), $$1.b().c($$3));
      } else {
         return false;
      }
   }

   public boolean a(cqk $$0, iy<daa> $$1, dnd $$2) {
      if (a($$2, this.b, this.d)) {
         return this.c;
      } else {
         this.b = $$2;
         this.d = false;
         ta $$3 = $$0.w();
         if ($$3 != null && $$3.b(this.a, 9)) {
            tg $$4 = $$3.c(this.a, 8);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               String $$6 = $$4.j($$5);

               try {
                  fk.b $$7 = fk.a($$1.p(), new StringReader($$6));
                  this.d = this.d | $$7.a();
                  if ($$7.test($$2)) {
                     this.c = true;
                     return true;
                  }
               } catch (CommandSyntaxException var9) {
               }
            }
         }

         this.c = false;
         return false;
      }
   }
}
