import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bmr {
   public static bmb<cck> a(float $$0, int $$1) {
      return bpm.a((Function<bpm.b<cck>, ? extends App<bpm.c<cck>, bpp<cck>>>)($$2 -> $$2.group($$2.c(btk.m)).apply($$2, $$2x -> ($$3, $$4, $$5) -> {
               if ($$3.b($$4.dl())) {
                  return false;
               } else {
                  bvi $$6 = $$3.w();
                  int $$7 = $$6.a(iu.a($$4.dl()));
                  eif $$8 = null;

                  for (int $$9 = 0; $$9 < 5; $$9++) {
                     eif $$10 = bvc.a($$4, 15, 7, $$1xxxx -> (double)(-$$6.a(iu.a($$1xxxx))));
                     if ($$10 != null) {
                        int $$11 = $$6.a(iu.a(ht.a($$10)));
                        if ($$11 < $$7) {
                           $$8 = $$10;
                           break;
                        }

                        if ($$11 == $$7) {
                           $$8 = $$10;
                        }
                     }
                  }

                  if ($$8 != null) {
                     $$2x.a(new btn($$8, $$0, $$1));
                  }

                  return true;
               }
            })));
   }
}
