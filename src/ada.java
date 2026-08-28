import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record ada(int b, int c, int d, List<ada.a> e) implements zw<aci> {
   public static final zn<xa, ada> a = zn.a(zl.g, ada::e, zl.g, ada::f, zl.g, ada::g, ada.a.a.a(zl.a()), ada::h, ada::new);

   public ada(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new ada.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(xs::a))).toList()
      );
   }

   @Override
   public zy<ada> a() {
      return agu.r;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public Suggestions b() {
      StringRange $$0 = StringRange.between(this.c, this.c + this.d);
      return new Suggestions($$0, this.e.stream().map($$1 -> new Suggestion($$0, $$1.a(), $$1.b().orElse(null))).toList());
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public List<ada.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<xp> c) {
      public static final zn<xa, ada.a> a = zn.a(zl.l, ada.a::a, xr.e, ada.a::b, ada.a::new);

      public String a() {
         return this.b;
      }

      public Optional<xp> b() {
         return this.c;
      }
   }
}
