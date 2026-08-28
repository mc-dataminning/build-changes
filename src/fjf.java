import org.lwjgl.opengl.ARBDirectStateAccess;

public class fjf implements fjg {
   @Override
   public int a() {
      return ARBDirectStateAccess.glCreateFramebuffers();
   }

   @Override
   public void a(int $$0, int $$1, int $$2, int $$3) {
      ARBDirectStateAccess.glNamedFramebufferTexture($$0, 36064, $$1, $$3);
      ARBDirectStateAccess.glNamedFramebufferTexture($$0, 36096, $$2, $$3);
   }
}
