import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dlm extends dfc {
   public static final MapCodec<dlm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lh.e.q().fieldOf("roots").forGetter($$0x -> $$0x.d), u()).apply($$0, dlm::new)
   );
   public static final duc b = dts.as;
   public static final int c = 3;
   private final dfc d;

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   protected dlm(dfc $$0, dtb.d $$1) {
      super($$1);
      this.d = $$0;
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean d_(dtc $$0) {
      return $$0.c(b) < 3;
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      int $$4 = $$0.c(b);
      if ($$4 < 3) {
         dno.a.a($$3).ifPresent($$5 -> {
            List<cuh> $$6 = dno.a($$1, $$2.a($$5), $$3);
            if ($$6 != null) {
               ir $$7 = $$2.c();
               $$6.forEach($$2xx -> a($$1, $$7, $$2xx));
               $$1.a($$2, $$0.a(b, Integer.valueOf($$4 + 1)), 4);
            }
         });
      }
   }
}
