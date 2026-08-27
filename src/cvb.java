import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class cvb implements cwd {
   public static final Codec<cvb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cvc.c.fieldOf("material").forGetter(cvb::b),
               cve.c.fieldOf("pattern").forGetter(cvb::a),
               axh.a(Codec.BOOL, "show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, cvb::new)
   );
   public static final ys<wf, cvb> b = ys.a(cvc.d, cvb::b, cve.d, cvb::a, yq.b, $$0 -> $$0.f, cvb::new);
   private static final wu c = wu.c(ac.a("item", new akh("smithing_template.upgrade"))).a(n.h);
   private final iw<cvc> d;
   private final iw<cve> e;
   private final boolean f;
   private final Function<iw<cqp>, akh> g;
   private final Function<iw<cqp>, akh> h;

   private cvb(iw<cvc> $$0, iw<cve> $$1, boolean $$2, Function<iw<cqp>, akh> $$3, Function<iw<cqp>, akh> $$4) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
   }

   public cvb(iw<cvc> $$0, iw<cve> $$1, boolean $$2) {
      this.d = $$0;
      this.e = $$1;
      this.g = ac.b($$2x -> {
         akh $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$4));
      });
      this.h = ac.b($$2x -> {
         akh $$3 = $$1.a().a();
         String $$4 = b($$0, $$2x);
         return $$3.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$4));
      });
      this.f = $$2;
   }

   public cvb(iw<cvc> $$0, iw<cve> $$1) {
      this($$0, $$1, true);
   }

   private static String b(iw<cvc> $$0, iw<cqp> $$1) {
      Map<iw<cqp>, String> $$2 = $$0.a().d();
      String $$3 = $$2.get($$1);
      return $$3 != null ? $$3 : $$0.a().a();
   }

   public boolean a(iw<cve> $$0, iw<cvc> $$1) {
      return $$0.equals(this.e) && $$1.equals(this.d);
   }

   public iw<cve> a() {
      return this.e;
   }

   public iw<cvc> b() {
      return this.d;
   }

   public akh a(iw<cqp> $$0) {
      return this.g.apply($$0);
   }

   public akh b(iw<cqp> $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof cvb $$1) ? false : this.f == $$1.f && this.e.equals($$1.e) && this.d.equals($$1.d);
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public void a(Consumer<wu> $$0, cuq $$1) {
      if (this.f) {
         $$0.accept(c);
         $$0.accept(wt.a().b(this.e.a().a(this.d)));
         $$0.accept(wt.a().b(this.d.a().e()));
      }
   }

   public cvb a(boolean $$0) {
      return new cvb(this.d, this.e, $$0, this.g, this.h);
   }
}
