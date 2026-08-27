import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cvs implements cwu {
   public static final Codec<cvs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cvt.c.fieldOf("material").forGetter(cvs::b),
               cvv.c.fieldOf("pattern").forGetter(cvs::a),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, cvs::new)
   );
   public static final yv<wi, cvs> b = yv.a(cvt.d, cvs::b, cvv.d, cvs::a, yt.b, $$0 -> $$0.f, cvs::new);
   private static final wx c = wx.c(ac.a("item", new akm("smithing_template.upgrade"))).a(n.h);
   private final ix<cvt> d;
   private final ix<cvv> e;
   private final boolean f;
   private final Function<ix<cre>, akm> g;
   private final Function<ix<cre>, akm> h;

   private cvs(ix<cvt> $$0, ix<cvv> $$1, boolean $$2, Function<ix<cre>, akm> $$3, Function<ix<cre>, akm> $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public cvs(ix<cvt> $$0, ix<cvv> $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.g = ac.b($$2x -> {
         akm $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$4));
      });
      this.h = ac.b($$2x -> {
         akm $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$4));
      });
      this.f = $$2;
   }

   public cvs(ix<cvt> $$0, ix<cvv> $$1) {
      this($$0, $$1, true);
   }

   private static String b(ix<cvt> $$0, ix<cre> $$1) {
      Map<ix<cre>, String> $$2 = $$0.a().d();
      String $$3 = $$2.get($$1);
      return $$3 != null ? $$3 : $$0.a().a();
   }

   public boolean a(ix<cvv> $$0, ix<cvt> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public ix<cvv> a() {
      return this.e;
   }

   public ix<cvt> b() {
      return this.d;
   }

   public akm a(ix<cre> $$0) {
      return this.g.apply($$0);
   }

   public akm b(ix<cre> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cvs $$1) ? false : this.f == $$1.f && this.e.equals($$1.e) && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public void a(Consumer<wx> $$0, cvh $$1) {
      if (this.f) {
         $$0.accept(c);
         $$0.accept(ww.a().b(this.e.a().a(this.d)));
         $$0.accept(ww.a().b(this.d.a().e()));
      }
   }

   public cvs a(boolean $$0) {
      return new cvs(this.d, this.e, $$0, this.g, this.h);
   }
}
