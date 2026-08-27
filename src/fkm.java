public class fkm extends fkt {
   private static final ws a = ws.c("outOfMemory.title");
   private static final ws b = ws.c("outOfMemory.message");
   private static final int c = 300;
   private final fih d = new fih(this);

   public fkm() {
      super(a);
   }

   @Override
   protected void aM_() {
      this.d.a(a, this.p);
      this.d.c(new fff(300, b, this.p));
      fil $$0 = this.d.b(fil.e().a(8));
      $$0.a(feu.a(wr.l, $$0x -> this.m.a(new fky())).a());
      $$0.a(feu.a(ws.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aD_() {
      return false;
   }
}
