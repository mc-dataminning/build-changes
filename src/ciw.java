import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;
import javax.annotation.Nullable;

public class ciw {
   private final String a;
   @Nullable
   private dhr b;
   private boolean c;
   private boolean d;

   public ciw(String $$0) {
      this.a = $$0;
   }

   private static boolean a(dhr $$0, @Nullable dhr $$1, boolean $$2) {
      if ($$1 == null || $$0.a() != $$1.a()) {
         return false;
      } else if (!$$2) {
         return true;
      } else if ($$0.b() == null && $$1.b() == null) {
         return true;
      } else {
         return $$0.b() != null && $$1.b() != null ? Objects.equals($$0.b().p(), $$1.b().p()) : false;
      }
   }

   public boolean a(clo $$0, is<cvf> $$1, dhr $$2) {
      if (a($$2, this.b, this.d)) {
         return this.c;
      } else {
         this.b = $$2;
         this.d = false;
         sd $$3 = $$0.v();
         if ($$3 != null && $$3.b(this.a, 9)) {
            sj $$4 = $$3.c(this.a, 8);

            for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
               String $$6 = $$4.j($$5);

               try {
                  fi.b $$7 = fi.a($$1.p(), new StringReader($$6));
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
