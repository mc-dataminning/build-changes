import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dih extends djx implements dfa, dly {
   public static final MapCodec<dih> a = b(dih::new);
   private static final dsr c = dsq.C;
   private final djy d = new djy(this);

   @Override
   public MapCodec<dih> a() {
      return a;
   }

   public dih(drz.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dsa> b(int $$0) {
      return $$1 -> djx.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      super.a($$0);
      $$0.a(c);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsa $$0, cxy $$1) {
      return !$$1.n().a(cuq.fW) || super.a($$0, $$1);
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      return je.a().anyMatch($$3 -> this.d.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      this.d.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(c) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dsa $$0, dbc $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   public djy c() {
      return this.d;
   }
}
