public class fsx implements fsz<dfg> {
   public static final ged a = new ged(gby.e, new agm("entity/bell/bell_body"));
   private static final String b = "bell_body";
   private final fkt c;

   public fsx(fta.a $$0) {
      fkt $$1 = $$0.a(fks.k);
      this.c = $$1.b("bell_body");
   }

   public static fkz b() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      flc $$2 = $$1.a("bell_body", fky.c().a(0, 0).a(-3.0F, -6.0F, -3.0F, 6.0F, 7.0F, 6.0F), fkv.a(8.0F, 12.0F, 8.0F));
      $$2.a("bell_base", fky.c().a(0, 13).a(4.0F, 4.0F, 4.0F, 8.0F, 2.0F, 8.0F), fkv.a(-8.0F, -12.0F, -8.0F));
      return fkz.a($$0, 32, 32);
   }

   public void a(dfg $$0, float $$1, eob $$2, fqz $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      float $$7 = 0.0F;
      float $$8 = 0.0F;
      if ($$0.b) {
         float $$9 = atq.a($$6 / (float) Math.PI) / (4.0F + $$6 / 3.0F);
         if ($$0.c == ib.c) {
            $$7 = -$$9;
         } else if ($$0.c == ib.d) {
            $$7 = $$9;
         } else if ($$0.c == ib.f) {
            $$8 = -$$9;
         } else if ($$0.c == ib.e) {
            $$8 = $$9;
         }
      }

      this.c.e = $$7;
      this.c.g = $$8;
      eof $$10 = a.a($$3, frh::c);
      this.c.a($$2, $$10, $$4, $$5);
   }
}
