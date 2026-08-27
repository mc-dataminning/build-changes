import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class egy extends ehc {
   public static final Codec<egy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.b),
               Codec.BOOL.optionalFieldOf("use_logs", false).forGetter($$0x -> $$0x.h),
               Codec.intRange(0, 16).fieldOf("exclusion_radius_xz").forGetter($$0x -> $$0x.c),
               Codec.intRange(0, 16).fieldOf("exclusion_radius_y").forGetter($$0x -> $$0x.d),
               Codec.list(egl.a).fieldOf("block_provider").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 16).fieldOf("required_empty_blocks").forGetter($$0x -> $$0x.f),
               axu.a(iw.g.listOf()).fieldOf("directions").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, egy::new)
   );
   protected final float b;
   protected final int c;
   protected final int d;
   protected final List<egl> e;
   protected final int f;
   protected final List<iw> g;
   protected boolean h;

   public egy(float $$0, boolean $$1, int $$2, int $$3, List<egl> $$4, int $$5, List<iw> $$6) {
      this.b = $$0;
      this.h = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   @Override
   public void a(ehc.a $$0) {
      Set<ir> $$1 = new HashSet<>();
      ayt $$2 = $$0.b();

      for (ir $$3 : this.h ? ad.a($$0.c(), $$2) : ad.a($$0.d(), $$2)) {
         iw $$4 = ad.a(this.g, $$2);
         ir $$5 = $$3.a($$4);
         if (!$$1.contains($$5) && $$2.i() < this.b && this.a($$0, $$3, $$4)) {
            ir $$6 = $$5.b(-this.c, -this.d, -this.c);
            ir $$7 = $$5.b(this.c, this.d, this.c);

            for (ir $$8 : ir.c($$6, $$7)) {
               $$1.add($$8.i());
            }

            for (egl $$9 : this.e) {
               $$0.a($$5, $$9.a($$2, $$5));
               $$5 = $$5.a($$4);
            }
         }
      }
   }

   private boolean a(ehc.a $$0, ir $$1, iw $$2) {
      for (int $$3 = 1; $$3 <= this.f; $$3++) {
         ir $$4 = $$1.a($$2, $$3);
         if (!$$0.a($$4)) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected ehd<?> a() {
      return ehd.f;
   }
}
