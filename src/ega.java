import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class ega extends efu {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected ejq b;
   protected ejm c;
   protected id d;

   public ega(egh $$0, int $$1, ejr $$2, ajv $$3, String $$4, ejm $$5, id $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(ij.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public ega(egh $$0, to $$1, ejr $$2, Function<ajv, ejm> $$3) {
      super($$0, $$1);
      this.a(ij.c);
      this.a = $$1.l("Template");
      this.d = new id($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      ajv $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected ajv b() {
      return new ajv(this.a);
   }

   @Override
   protected void a(egg $$0, to $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dab $$0, czz $$1, drf $$2, axt $$3, efi $$4, cyn $$5, id $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (ejq.c $$8 : this.b.a(this.d, this.c, dcj.pa)) {
            if ($$8.c() != null) {
               dqs $$9 = dqs.valueOf($$8.c().l("mode"));
               if ($$9 == dqs.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (ejq.c $$11 : this.b.a(this.d, this.c, dcj.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dpi $$13 = dcj.a.n();

               try {
                  $$13 = fo.a($$0.a(ku.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, id var2, czv var3, axt var4, efi var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dit a() {
      return this.c.d();
   }

   public ejq c() {
      return this.b;
   }

   public id d() {
      return this.d;
   }

   public ejm e() {
      return this.c;
   }
}
