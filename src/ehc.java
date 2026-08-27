import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ehc extends egz {
   public static final Codec<ehc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asg.a(kc.F).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, ehc::new)
   );
   private final asg<cmc> j;
   private final boolean k;

   private ehc(asg<cmc> $$0, boolean $$1, int $$2, int $$3, List<ejd> $$4, List<ehr> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public egy a() {
      return egv.f;
   }

   @Override
   public void a(Consumer<cmh> $$0, ege $$1) {
      kb.h.c(this.j).forEach($$1x -> $$0.accept(new cmh($$1x)));
   }

   private boolean a(ege $$0, Consumer<egw> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final ie<cmc> $$2 : kb.h.c(this.j)) {
            $$1.accept(new egz.c() {
               @Override
               public void a(Consumer<cmh> $$0, ege $$1) {
                  $$0.accept(new cmh($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ege $$0, Consumer<egw> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static egz.a<?> a(asg<cmc> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ehc($$0, false, $$1, $$2, $$3, $$4));
   }

   public static egz.a<?> b(asg<cmc> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ehc($$0, true, $$1, $$2, $$3, $$4));
   }
}
