import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class eml extends emf {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected eqd b;
   protected epz c;
   protected jh d;

   public eml(ems $$0, int $$1, eqe $$2, all $$3, String $$4, epz $$5, jh $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jm.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public eml(ems $$0, un $$1, eqe $$2, Function<all, epz> $$3) {
      super($$0, $$1);
      this.a(jm.c);
      this.a = $$1.l("Template");
      this.d = new jh($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      all $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected all b() {
      return all.a(this.a);
   }

   @Override
   protected void a(emr $$0, un $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dgd $$0, dgb $$1, dxk $$2, azv $$3, elt $$4, del $$5, jh $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (eqd.c $$8 : this.b.a(this.d, this.c, dil.pa)) {
            if ($$8.c() != null) {
               dwx $$9 = dwx.valueOf($$8.c().l("mode"));
               if ($$9 == dwx.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (eqd.c $$11 : this.b.a(this.d, this.c, dil.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dvo $$13 = dil.a.m();

               try {
                  $$13 = gq.a($$0.a(ma.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, jh var2, dfw var3, azv var4, elt var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dow a() {
      return this.c.d();
   }

   public eqd c() {
      return this.b;
   }

   public jh d() {
      return this.d;
   }

   public epz e() {
      return this.c;
   }
}
