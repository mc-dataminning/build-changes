public record fef(fbx b, fbx c, fbx d) {
   public static final fef a = new fef(fbx.c, new fbx(0.0, 0.0, -1.0), new fbx(0.0, 1.0, 0.0));

   public fbx a() {
      return this.c.c(this.d);
   }
}
