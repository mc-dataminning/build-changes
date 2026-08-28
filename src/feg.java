public record feg(fbx b, fbx c, fbx d) {
   public static final feg a = new feg(fbx.c, new fbx(0.0, 0.0, -1.0), new fbx(0.0, 1.0, 0.0));

   public fbx a() {
      return this.c.c(this.d);
   }
}
