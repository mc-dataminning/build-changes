import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eoi extends eof {
   public static final Codec<eoi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avt.a(ku.G).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, eoi::new)
   );
   private final avt<crn> j;
   private final boolean k;

   private eoi(avt<crn> $$0, boolean $$1, int $$2, int $$3, List<eql> $$4, List<eoy> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public eoe a() {
      return eob.f;
   }

   @Override
   public void a(Consumer<crs> $$0, enk $$1) {
      kt.h.c(this.j).forEach($$1x -> $$0.accept(new crs($$1x)));
   }

   private boolean a(enk $$0, Consumer<eoc> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final in<crn> $$2 : kt.h.c(this.j)) {
            $$1.accept(new eof.c() {
               @Override
               public void a(Consumer<crs> $$0, enk $$1) {
                  $$0.accept(new crs($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(enk $$0, Consumer<eoc> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static eof.a<?> a(avt<crn> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eoi($$0, false, $$1, $$2, $$3, $$4));
   }

   public static eof.a<?> b(avt<crn> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eoi($$0, true, $$1, $$2, $$3, $$4));
   }
}
