import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cvu implements cww {
   public static final Codec<cvu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cvv.c.fieldOf("material").forGetter(cvu::b),
               cvx.c.fieldOf("pattern").forGetter(cvu::a),
               Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, cvu::new)
   );
   public static final yv<wi, cvu> b = yv.a(cvv.d, cvu::b, cvx.d, cvu::a, yt.b, $$0 -> $$0.f, cvu::new);
   private static final wx c = wx.c(ac.a("item", new akn("smithing_template.upgrade"))).a(n.h);
   private final ix<cvv> d;
   private final ix<cvx> e;
   private final boolean f;
   private final Function<ix<crg>, akn> g;
   private final Function<ix<crg>, akn> h;

   private cvu(ix<cvv> $$0, ix<cvx> $$1, boolean $$2, Function<ix<crg>, akn> $$3, Function<ix<crg>, akn> $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public cvu(ix<cvv> $$0, ix<cvx> $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.g = ac.b($$2x -> {
         akn $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$4));
      });
      this.h = ac.b($$2x -> {
         akn $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$4));
      });
      this.f = $$2;
   }

   public cvu(ix<cvv> $$0, ix<cvx> $$1) {
      this($$0, $$1, true);
   }

   private static String b(ix<cvv> $$0, ix<crg> $$1) {
      Map<ix<crg>, String> $$2 = $$0.a().d();
      String $$3 = $$2.get($$1);
      return $$3 != null ? $$3 : $$0.a().a();
   }

   public boolean a(ix<cvx> $$0, ix<cvv> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public ix<cvx> a() {
      return this.e;
   }

   public ix<cvv> b() {
      return this.d;
   }

   public akn a(ix<crg> $$0) {
      return this.g.apply($$0);
   }

   public akn b(ix<crg> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cvu $$1) ? false : this.f == $$1.f && this.e.equals($$1.e) && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public void a(Consumer<wx> $$0, cvj $$1) {
      if (this.f) {
         $$0.accept(c);
         $$0.accept(ww.a().b(this.e.a().a(this.d)));
         $$0.accept(ww.a().b(this.d.a().e()));
      }
   }

   public cvu a(boolean $$0) {
      return new cvu(this.d, this.e, $$0, this.g, this.h);
   }
}
