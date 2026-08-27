import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Codec;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.compress.utils.Lists;

public class eug extends eus {
   @Nullable
   private final enq<Unit> l;

   public static eug a(enn $$0, euq $$1, enr $$2) {
      List<enq<?>> $$3 = Lists.newArrayList();
      $$3.add($$2.O());
      $$3.add($$2.P());
      enq<Unit> $$4 = x.a(
         $$0.s,
         $$0x -> {
            bdu $$1x = $$0x.ai();
            return new enq<>(
               "options.difficulty.online",
               enq.a(),
               ($$1xx, $$2x) -> $$1x.b(),
               new enq.e<>(List.of(Unit.INSTANCE), Codec.EMPTY.codec()),
               Unit.INSTANCE,
               $$0xx -> {
               }
            );
         }
      );
      if ($$4 != null) {
         $$3.add($$4);
      }

      return new eug($$1, $$2, $$3.toArray(new enq[0]), $$4);
   }

   private eug(euq $$0, enr $$1, enq<?>[] $$2, @Nullable enq<Unit> $$3) {
      super($$0, $$1, sw.c("options.online.title"), $$2);
      this.l = $$3;
   }

   @Override
   protected void b() {
      super.b();
      if (this.l != null) {
         epf $$0 = this.k.b(this.l);
         if ($$0 != null) {
            $$0.r = false;
         }
      }

      epf $$1 = this.k.b(this.b.ad());
      if ($$1 != null) {
         $$1.r = this.f.A();
      }
   }
}
