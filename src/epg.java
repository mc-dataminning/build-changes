import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class epg extends epl {
   public static final MapCodec<epg> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(epg::new, $$0 -> $$0.b);
   private final float b;

   public epg(float $$0) {
      this.b = $$0;
   }

   @Override
   protected epm<?> a() {
      return epm.e;
   }

   @Override
   public void a(epl.a $$0) {
      azx $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<iv> $$2 = $$0.c();
         if (!$$2.isEmpty()) {
            int $$3 = $$2.getFirst().v();
            $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
               for (jb $$3x : jb.c.a) {
                  if ($$1.i() <= 0.25F) {
                     jb $$4 = $$3x.g();
                     iv $$5 = $$2x.b($$4.j(), 0, $$4.l());
                     if ($$0.a($$5)) {
                        $$0.a($$5, dne.gb.m().b(dok.c, Integer.valueOf($$1.a(3))).b(dok.e, $$3x));
                     }
                  }
               }
            });
         }
      }
   }
}
