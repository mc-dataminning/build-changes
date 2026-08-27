import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dbj extends ddc implements ddp {
   public static final MapCodec<dbj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(div.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dbj::new)
   );
   public static final dkg b = djw.at;
   public static final int c = 4;
   private static final eml[] j = new eml[]{
      cwp.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      cwp.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      cwp.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      cwp.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      cwp.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final djx k = djw.C;
   public static final djx d = djw.j;

   @Override
   public MapCodec<dbj> a() {
      return a;
   }

   public dbj(div $$0, djf.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(djg $$0, csu $$1, hx $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(cwr.dR);
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      eeq $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eer.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      els $$4 = $$0.n($$1, $$2);
      eml $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return h($$0) ? $$1.a_($$2.c()).a(cwr.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return $$1 == ic.b && !$$0.a($$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(k) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
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
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      return !h($$2) || !n($$2);
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return h($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      if (h($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean h(djg $$0) {
      return $$0.c(d);
   }

   private static boolean n(djg $$0) {
      return $$0.c(b) == 4;
   }

   public static djg c() {
      return b(0);
   }

   public static djg b(int $$0) {
      return cwr.E.o().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
