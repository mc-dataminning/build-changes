import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aak implements wk<yd> {
   private final aak.a a;
   private final List<agg> b;
   private final List<agg> c;
   private final aqr d;

   public aak(aak.a $$0, Collection<agg> $$1, Collection<agg> $$2, aqr $$3) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = ImmutableList.copyOf($$2);
      this.d = $$3;
   }

   public aak(tu $$0) {
      this.a = $$0.b(aak.a.class);
      this.d = aqr.a($$0);
      this.b = $$0.a(tu::t);
      if (this.a == aak.a.a) {
         this.c = $$0.a(tu::t);
      } else {
         this.c = ImmutableList.of();
      }
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
      this.d.b($$0);
      $$0.a(this.b, tu::a);
      if (this.a == aak.a.a) {
         $$0.a(this.c, tu::a);
      }
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public List<agg> a() {
      return this.b;
   }

   public List<agg> d() {
      return this.c;
   }

   public aqr e() {
      return this.d;
   }

   public aak.a f() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
