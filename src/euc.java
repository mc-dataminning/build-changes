import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.slf4j.Logger;

public class euc extends eug {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<euc> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ala.a(lv.bd).fieldOf("name").forGetter($$0x -> $$0x.c)).apply($$0, euc::new)
   );
   private final ala<euh> c;

   private euc(List<ewe> $$0, ala<euh> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eui<euc> b() {
      return euj.H;
   }

   @Override
   public void a(esz $$0) {
      if (!$$0.b()) {
         $$0.b("Uses reference to " + this.c.a() + ", but references are not allowed");
      } else if ($$0.a(this.c)) {
         $$0.b("Function " + this.c.a() + " is recursively called");
      } else {
         super.a($$0);
         $$0.a()
            .a(lv.bd, this.c)
            .ifPresentOrElse($$1 -> $$1.a().a($$0.a(".{" + this.c.a() + "}", this.c)), () -> $$0.b("Unknown function table called " + this.c.a()));
      }
   }

   @Override
   protected cvl a(cvl $$0, est $$1) {
      euh $$2 = $$1.a().a(lv.bd, this.c).map(jn::a).orElse(null);
      if ($$2 == null) {
         b.warn("Unknown function: {}", this.c.a());
         return $$0;
      } else {
         est.c<?> $$3 = est.a($$2);
         if ($$1.b($$3)) {
            cvl var5;
            try {
               var5 = $$2.apply($$0, $$1);
            } finally {
               $$1.c($$3);
            }

            return var5;
         } else {
            b.warn("Detected infinite loop in loot tables");
            return $$0;
         }
      }
   }

   public static eug.a<?> a(ala<euh> $$0) {
      return a($$1 -> new euc($$1, $$0));
   }
}
