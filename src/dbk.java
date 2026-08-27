import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dbk extends ddd implements ddq {
   public static final MapCodec<dbk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(diw.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dbk::new)
   );
   public static final dkh b = djx.at;
   public static final int c = 4;
   private static final emm[] j = new emm[]{
      cwq.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      cwq.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      cwq.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      cwq.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      cwq.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final djy k = djx.C;
   public static final djy d = djx.j;

   @Override
   public MapCodec<dbk> a() {
      return a;
   }

   public dbk(diw $$0, djg.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(djh $$0, csv $$1, hx $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cws.dR);
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      eer $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ees.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      elt $$4 = $$0.n($$1, $$2);
      emm $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return h($$0) ? $$1.a_($$2.c()).a(cws.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return $$1 == ic.b && !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(k) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      if (!h($$0)) {
         if ($$3.a(7) == 0) {
            this.a($$1, $$2, $$0, $$3);
         }
      } else {
         if (!n($$0)) {
            $$1.a($$2, $$0.a(b), 2);
         }
      }
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return !h($$2) || !n($$2);
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return h($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      if (h($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean h(djh $$0) {
      return $$0.c(d);
   }

   private static boolean n(djh $$0) {
      return $$0.c(b) == 4;
   }

   public static djh c() {
      return b(0);
   }

   public static djh b(int $$0) {
      return cws.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
