import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record acp(int b, int c, int d, List<acp.a> e) implements zj<aby> {
   public static final za<wn, acp> a = za.a(yy.h, acp::e, yy.h, acp::f, yy.h, acp::g, acp.a.a.a(yy.a()), acp::h, acp::new);

   public acp(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new acp.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(xf::a))).toList()
      );
   }

   @Override
   public zl<acp> a() {
      return agr.q;
   }

   public void a(aby $$0) {
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

   public List<acp.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<xc> c) {
      public static final za<wn, acp.a> a = za.a(yy.p, acp.a::a, xe.e, acp.a::b, acp.a::new);

      public String a() {
         return this.b;
      }

      public Optional<xc> b() {
         return this.c;
      }
   }
}
